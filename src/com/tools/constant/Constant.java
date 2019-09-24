package com.tools.constant;

/**
 * @author LC
 * @des
 */
public class Constant {
    public final static String txt ="  for (int ii = 0; ii < jArray.length(); ii++) {\n" +
            "                    String sPath = jArray.getJSONObject(ii).optString(\"path\");\n" +
            "                    if (!TextUtils.isEmpty(sPath) && sPath.equals(customPath)) {\n" +
            "                        jArray.getJSONObject(ii).put(\"isAllFiletypes\", cf.isAllFiletypes);\n" +
            "                        jArray.getJSONObject(ii).put(\"isCustomtypes\", cf.isCustomtypes);\n" +
            "\n" +
            "                        jArray.getJSONObject(ii).put(\"isFilesonly\", cf.isFilesonly);\n" +
            "                        jArray.getJSONObject(ii).put(\"isFilesAndSubs\", cf.isFilesAndSubs);\n" +
            "                        jArray.getJSONObject(ii).put(\"isFilesAndSubsAll\", cf.isFilesAndSubsAll);\n" +
            "\n" +
            "                        if (cf.isCustomtypes && cf.listTypes != null) {\n" +
            "                            jAarryTypes = new JSONArray();\n" +
            "                            for (String filetype : cf.listTypes) {\n" +
            "                                jAarryTypes.put(filetype);\n" +
            "                            }\n" +
            "                        }\n" +
            "\n" +
            "                        if (jAarryTypes != null) {\n" +
            "                            jArray.getJSONObject(ii).put(\"typeslist\", jAarryTypes);\n" +
            "                        } else {\n" +
            "                            jArray.getJSONObject(ii).put(\"typeslist\", null);\n" +
            "                        }\n" +
            "                    }\n" +
            "                }";
}
