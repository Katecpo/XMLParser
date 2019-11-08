package xmlparser;

import java.io.File;

/**
 * Utils for this project
 * @author bd062554
 */
public class Utils {
    
    /**
     * Return file extension
     * @param file File you want its extension
     * @return Extension of file
     */
    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
