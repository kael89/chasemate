package org.kkarvounis.checkmatefinder.testing;

import java.io.File;

public class TestingHelper {
    // TODO put in config file?
    private static final String TEST_DATA_DIR = "src/test/resources/data/";

    public static File getDataFile(String $filename)
    {
        return  new File(TEST_DATA_DIR + $filename);
    }
}
