package O5_Object_oriented_desing_and_analysis.O8_22032023_lld_design_patterns_introduction_and_singleton.singleton_v1;

import java.util.List;
/*
Singleton V1 - In this version of singleton implementation we have the issue of creation of multiple Database
objects initially. It could happen if multiple threads will access the getInstance() method when obj = null
*/
public class Database {
    List<String> stringList;
    String url;
    String password;
    private static Database obj;
    private Database() {}
    void executeQuery() {}
    public static Database getInstance() {
        if(obj == null) {
            obj = new Database();
        }
        return obj;
    }
}
