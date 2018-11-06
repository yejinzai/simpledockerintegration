import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {
  def main(args: Array[String]) {
    
    val logDir = "file:///opt/spark/source"
    
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    
    val logData = sc.textFile(logDir, 2).cache()
    
    val ctr = logData.filter(line => line.contains("hello")).count()
    
    println("hello count: %s".format(ctr))
  }
}
