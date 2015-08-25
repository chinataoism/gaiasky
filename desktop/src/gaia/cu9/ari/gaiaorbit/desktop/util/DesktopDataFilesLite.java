package gaia.cu9.ari.gaiaorbit.desktop.util;

import gaia.cu9.ari.gaiaorbit.util.IDataFiles;

public class DesktopDataFilesLite implements IDataFiles {

    @Override
    public String getJsonFiles() {
        return "data/planets.json data/satellites.json data/orbits.json data/extra.json";
    }

    @Override
    public String getCatalogFiles() {
        return "/home/tsagrista/Gaia/data/HYG/hyg-days/hygxyz-20150825.bin";
    }

    @Override
    public String getConstellationFiles() {
        return null;
    }

    @Override
    public String getBoundaryFiles() {
        return null;
    }

}
