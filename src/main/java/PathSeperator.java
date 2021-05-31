import java.time.Instant;

public class PathSeperator {
    private static String[] splitS3FilePath(String path) {
        return path.substring("san://".length(), path.length()).split("/", 2);
    }

    public static String in(String str){
        //String old_agg_bucket = coldStore.extractBucketName(sparkJobInputs.getAggregateFilePath());

        String new_agg_bucket = (str.split("-", 5)[4]);
    System.out.println("8888888888888 "+new_agg_bucket);
    System.out.println("00000000000000000000000000 "+str.split("-", 4)[3]);
        int idx = str.indexOf("-");
    System.out.println(idx);
        String a = str.substring(0, idx);
    System.out.println("************"+a);
        String b = str.substring(idx+3, str.length());
        return b;
    }
    public static String extractBucketName(String path) {
        return splitS3FilePath(path)[0];
    }

  public static void main(String[] args) {
    //
/*String x = extractBucketName("s3n://aggregate-coldstorage-bucket-prod-b-eu-central-1/ef84d7d045144ab992abe669510117f3");
    System.out.println(x);
    String y = in("ts-aggregate-coldstorage-bucket-prod-b-eu-central-1");
    System.out.println(y);*/
      Instant ttl = Instant.now().plusSeconds(604800l);
      String ttlStr = String.valueOf(ttl.getEpochSecond());
    System.out.println(ttlStr);
  }
}
