import java.util.*;

public class Test {

public static void main(String str[]) {

String scn="Sun,Mon,Tues,Wed,Thurs,Fri,Sat";

Scanner scan=new Scanner(scn);

scan.useDelimiter(",");

while(scan.hasNext()) {

System.out.println(scan.nextInt()+" ");

}

}

}