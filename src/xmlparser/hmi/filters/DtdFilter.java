package xmlparser.hmi.filters;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import xmlparser.Utils;

/**
 * Represents a dtd filter for a file chooser
 * @author bd062554
 */
public class DtdFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        if (Utils.getFileExtension(f).equals("dtd")) {
            return true;
        }

        return false;
    }

    @Override
    public String getDescription() {
        return "DTD file (.dtd)";
    }
    
}
