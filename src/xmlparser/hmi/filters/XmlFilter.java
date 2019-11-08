package xmlparser.hmi.filters;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import xmlparser.Utils;

/**
 * Represents a XML filter for file selection
 * @author bd062554
 */
public class XmlFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        if (Utils.getFileExtension(f).equals("xml")) {
            return true;
        }

        return false;
    }

    @Override
    public String getDescription() {
        return "XML file (.xml)";
    }
}
