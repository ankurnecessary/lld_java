package O5_Object_oriented_desing_and_analysis.O8_22032023_lld_design_patterns_introduction_and_singleton.singleton_v2;

import java.util.List;
/*
Singleton V1 - In this version of singleton implementation we have the issue of creation of multiple Database
objects initially. It could happen if multiple threads will access the getInstance() method when obj = null

Singleton V2 - In this version of singleton implementation, we countered the issue of creation of multiple
Database objects initially but by using synchronized keyword in getInstance() method we introduced a performance
issue. Not only one thread is allowed to access the getInstance() method at a time, even when obj != null. This
will impact the performance of the application.
*/
public class Database {
    List<String> stringList;
    String url;
    String password;
    private static Database obj;
    private Database() {}
    void executeQuery() {}
    public static synchronized Database getInstance() {
        if(obj == null) {
            obj = new Database();
        }
        return obj;
    }
}
