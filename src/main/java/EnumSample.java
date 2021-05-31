import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public enum EnumSample {
  HELIUM("He", "Gas"),
  MAGNESIUM("Mg", "Sollid");
  private final String cS;
  private final String n;

  EnumSample(String ncs, String nN) {
    cS = ncs;
    n = nN;
  }

  public static void main(String[] args) {
    /*System.out.printf(
            "%s,%s,%s",
            EnumSample.HELIUM.toString(), EnumSample.HELIUM.chemicalSym(), EnumSample.HELIUM.n);
        System.out.println("//////////////////////");
        System.out.println(EnumSample.HELIUM);
        System.out.println(20 >> 7); //  20/2^7  =0
        System.out.println(30 << 5); // 30*2^5 = 960
        final ZonedDateTime after24Hours = ZonedDateTime.now().plusHours(12);
        System.out.println(ZonedDateTime.now().toString());
        final String httpDate = DateTimeFormatter.RFC_1123_DATE_TIME.format(after24Hours);
        System.out.println(httpDate);
        String x = "migrationStatus";
        String y = "completed";
        if (x.equals("migrationStatus") || y.equals("completed")) {
          System.out.println("in if block");
        }
    */
    String xx =
        "_time1537542061000angle12500_itime1615252279039_time1537542065000angle9000_itime1615252279039_time1537542122000angle9500_itime1615252279039_time1537542162000angle9600_itime1615252279039_time1537542220000angle9700_itime1615252279039_time1537542230000angle12500_itime1615252279039";
    System.out.println("getbyees" + (UUID.nameUUIDFromBytes(xx.getBytes()).toString()));

    String fromTime = "2018-09-21T02:31:00Z";
    Instant date = Instant.parse(fromTime).truncatedTo(ChronoUnit.HOURS);
    System.out.println("*****");
    System.out.println(date);
    System.out.println(Instant.parse(fromTime));
    System.out.println(getYear(Instant.parse(fromTime)));
    /*    // change 60 minutes to 59 (otherwise it doesn't work)
        String timeDateStr = "2017-18-08T12:45:30Z";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-dd-MMTHH:mm:ssZ");
    // parse to LocalDateTime
        LocalDateTime dt = LocalDateTime.parse(timeDateStr, dtf);

    // assume the LocalDateTime is in UTC
        Instant instant = dt.toInstant(ZoneOffset.UTC);
        System.out.println(instant.toEpochMilli());*/
    System.out.println((Math.round(49117 / 1024)) / 100.0);
    Instant dayInstant = Instant.parse(fromTime).truncatedTo(ChronoUnit.DAYS);

    System.out.println(dayInstant);
    System.out.println(
        LocalDateTime.ofInstant(dayInstant.truncatedTo(ChronoUnit.DAYS), ZoneId.of("Z"))
            .format(DateTimeFormatter.ISO_DATE));
    Instant hourInstant =
        getInstant(
            LocalDateTime.ofInstant(dayInstant.truncatedTo(ChronoUnit.DAYS), ZoneId.of("Z"))
                .format(DateTimeFormatter.ISO_DATE),
            "1900");
    System.out.println(hourInstant);
    long sum = 0L;
    List<String> _test = new ArrayList<>();

    _test.add("shikha");
    _test.add("bla");
    for (String t : _test) {
      System.out.println("********** " + t);
      sum++;
    }
    String billingBucketName="shikha-";
    System.out.println(sum);
    String path = "s3n://ms-sfdsf-dgdfgdf-dfddfgd-dsfsdf-coldstorage-iot-intg-eu-central-1";
    String[] splitPath = path.split("-");
    String postfix = path.substring(path.indexOf(splitPath[splitPath.length - 4]));
    //System.out.println("path os " + postfix);
    if(postfix.contains("dev")){
      System.out.println("new-".concat(postfix));
    } else {
      System.out.println(postfix);
}
    System.out.println(
            billingBucketName = billingBucketName.concat(postfix));
    System.out.println(billingBucketName);
    //System.out.println(Instant.ofEpochMilli(1615728666240l).truncatedTo(ChronoUnit.HOURS));
    Instant x = Instant.ofEpochMilli(1615728666240l).truncatedTo(ChronoUnit.HOURS);
    //System.out.println("..........." + x);
    // path.substring(path.indexOf("-"))

    HashMap<Integer, Integer> text = new HashMap<Integer, Integer>();
    text.put(1, 10);
    text.put(2, 110);
    text.put(3, 120);
    if (text.containsKey(1)) {
      text.put(1, text.get(1) + 2);
    }

  //  System.out.println("text us : " + text.keySet());

    long logicalSize = 8;
    int rowSize = 0;

    Instant _tme = Instant.ofEpochMilli(1615726806180l).truncatedTo(ChronoUnit.HOURS);
    Instant _tme1 = Instant.ofEpochMilli(1616683768000l).truncatedTo(ChronoUnit.HOURS);
    Instant _tme2 = Instant.ofEpochMilli(1616424568000l).truncatedTo(ChronoUnit.HOURS);
    Map<Instant, BillingRecord> hourlyData = new HashMap<>();
    hourlyData.put(_tme1, new BillingRecord(11l, 1));
    hourlyData.put(_tme2, new BillingRecord(0l, 0));
    hourlyData.put(_tme, new BillingRecord(logicalSize, 1)); // 8
    if (hourlyData.containsKey(_tme1)) {

      BillingRecord billingRecord = hourlyData.get(_tme1);
      billingRecord.setSize(billingRecord.getSize() + logicalSize);
      billingRecord.setNumOfRecords(rowSize++);
      hourlyData.put(_tme, billingRecord);
    } else {
      hourlyData.put(_tme, new BillingRecord(logicalSize, 1));
    }

    System.out.println("------------- " + hourlyData.entrySet().toString());

    System.out.println(hourlyData.keySet().toArray()[0]);
    Instant firstKey = hourlyData.keySet().stream().findFirst().get();
    System.out.println(firstKey);
    List<RawRecord> parquetRecordsList = new ArrayList<>();

    hourlyData.forEach(
        (key, value) -> {
          System.out.println("createRawRecord(key, value) "+ createRawRecord(key, value));
          parquetRecordsList.add(createRawRecord(key, value));
        });

    System.out.println(parquetRecordsList);
/*
    parquetRecordsList.forEach(
        (RawRecord) -> {
          System.out.println("balu fr x is " + RawRecord.getTime());
        });*/

    RawRecord rawRecord = createRawRecord(_tme, new BillingRecord(28l, 2));

    System.out.println("rawRecord.getTime() "+ rawRecord.getTime());
    System.out.println("rawRecord.getTime() "+ rawRecord.getInsertTime());
  }

  public static RawRecord createRawRecord(Instant time, BillingRecord billingRecord) {

    RawRecord record = new RawRecord(time, new HashMap<>());
    record.add("numOfRecords", billingRecord.getNumOfRecords());
    record.add("size", billingRecord.getSize());
    return record;
  }
  /**
   * @param date 2007-12-03
   * @param hour 0100 (hhmm)
   * @return Instant from given date and hour
   */
  private static Instant getInstant(String date, String hour) {
    return Instant.parse(
        new StringBuffer(date)
            .append("T")
            .append(hour, 0, 2)
            .append(":")
            .append(hour.substring(2))
            .append(":00Z"));
  }

  public static int getYear(Instant hour) {

    if (null != hour) {
      return hour.atZone(ZoneOffset.UTC).getYear();
    }
    return 0;
  }

  public String chemicalSym() {
    return cS;
  }

  public String na() {
    return n;
  }
}

class BillingRecord {
  Long size = 0l;
  Integer numOfRecords = 0;

  public BillingRecord(Long size, Integer numOfRecords) {
    this.size = size;
    this.numOfRecords = numOfRecords;
  }

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Integer getNumOfRecords() {
    return numOfRecords;
  }

  public void setNumOfRecords(Integer numOfRecords) {
    this.numOfRecords = numOfRecords;
  }

  @Override
  public String toString() {
    return "BillingRecord{" + "size=" + size + ", numOfRecords=" + numOfRecords + '}';
  }
}
