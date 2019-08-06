package com.tools.constant;

/**
 * @author LC
 * @des
 */
public class Constant {
    public final static String txt ="" +
            " newFile = new File(gameCachePath + File.separator + pkgName + \"/files/yume_android_sdk\");\n" +
            "                            if (newFile != null && newFile.exists()) {\n" +
            "                                if (isIgnorePath(newFile.getAbsolutePath())) {\n" +
            "                                    continue;\n" +
            "                                }\n" +
            "                                if (isAppInstalled(pkgName)) {\n" +
            "                                    addCacheJunkFile(newFile, \"\", pkgName, mContext.getString(R.string.clean_str_cache_name),\n" +
            "                                            false, true, 0);\n" +
            "                                } else {\n" +
            "                                    pathGameSets.add(newFile.getAbsolutePath());\n" +
            "                                }\n" +
            "                            }\n" +
            "\n" +
            "                            newFile = new File(gameCachePath + File.separator + pkgName + \"/files/.vungle\");";
}
