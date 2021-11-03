import scala.Tuple2; 
import org.apache.spark.api.java.JavaPairRDD; 
import org.apache.spark.api.java.JavaRDD; 
import org.apache.spark.sql.SparkSession; 
import java.util.Arrays; 
import java.util.List; 
import java.util.regex.Pattern; 

public final class Task1{
    public static void main(String[] args) throws Exception {
        SparkSession spark = SparkSession
.builder() 
.appName("Task1") 
.getOrCreate(); 
JavaRDD<String> lines = spark.read().textFile(args[1]).javaRDD(); 

    }

}
