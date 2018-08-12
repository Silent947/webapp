package com.nyote.web.webapp.filesystem;

import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.Path;

public class ImageResolver {

    private final static String root = "./";

    public File fromPath(String path)
    {
        return new File(root+path);
    }

    public boolean fromPathExists(String path)
    {
        return false;
    }
}
