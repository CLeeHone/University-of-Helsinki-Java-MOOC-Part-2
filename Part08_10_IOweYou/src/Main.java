public class Main {
 
    public static void main(String[] args) { 
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Olivia", 51.5);
        mattsIOU.setSum("Michael", 30);
 
        System.out.println(mattsIOU.howMuchDoIOweTo("Olivia"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Trevor"));
    }
}