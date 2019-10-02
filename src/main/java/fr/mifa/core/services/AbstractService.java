package fr.mifa.core.services;

import fr.mifa.core.utils.ApplicationDirectories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class AbstractService implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(AbstractService.class);

    public abstract void saveState();

    public abstract void loadState();

    protected ObjectOutputStream getOutputStream() {
        Path dataPath = ApplicationDirectories.dataDir("MIFA");
        try {
            Files.createDirectories(dataPath);
            FileOutputStream fout = new FileOutputStream( dataPath.resolve(this.getClass().getCanonicalName()).toString() );
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            return oos;
        }
        catch ( IOException ex ) {
            logger.error(ex.toString());
        }
        return null;
    }

    protected ObjectInputStream getInputStream() {
        Path dataPath = ApplicationDirectories.dataDir("MIFA").resolve(this.getClass().getCanonicalName());
        try {
            if (Files.exists(dataPath)) {
                FileInputStream fin = new FileInputStream( dataPath.toString() );
                ObjectInputStream ois = new ObjectInputStream(fin);
                return ois;
            }
        }
        catch ( IOException ex ) {
            logger.error(ex.toString());
        }
        return null;
    }
}
