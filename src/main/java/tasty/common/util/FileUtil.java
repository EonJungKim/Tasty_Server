package tasty.common.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

    private static final int BUFFER_SIZE = 2048;

    public static boolean checkNull(MultipartFile file) {
        return (file == null);
    }

    public static boolean initFileDir(String folderPath) {
        String[] rootPathList = folderPath.split("/");
        String dirPath = rootPathList[0];

        for (int i=1; i<rootPathList.length; i++) {
            dirPath += "/" + rootPathList[i];

            if (!makeDirectory(dirPath)) {
                return false;
            }
        }

        return true;
    }

    public static boolean makeDirectory(String dirPath) {
        File directory = new File(dirPath);

        if (!directory.exists()) {
            if (!directory.mkdir()) {
                return false;
            }
        }

        return true;
    }

    public static boolean saveFile(String filePath, String fileName, MultipartFile file) {
        boolean result = true;

        FileOutputStream fos = null;
        InputStream is = null;

        try {
            if (!initFileDir(filePath)) {
                return false;
            }

            fos = new FileOutputStream(filePath + "/" + fileName);
            is = file.getInputStream();

            int readCount = 0;
            byte[] buffer = new byte[BUFFER_SIZE];

            while ((readCount = is.read(buffer)) != -1) {
                fos.write(buffer, 0, readCount);
            }
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.flush();
                    fos.close();
                }

                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static boolean deleteFile(String filePath) {
        boolean result = false;

        try {
            File file = new File(filePath);
            if (file.exists()) {
                result = file.delete();
            }
        } catch (Exception e) {
            result = false;
        }

        return result;
    }
}
