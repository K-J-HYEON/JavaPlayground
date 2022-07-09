//package cote.grammer;
//
//class Sample {
//    int i; // 0으로 초기화
//    String j; // null로 초기화
//
//    void method() {
//        int i;
//        int j = i; // 컴파일 에러!
//    }
//}
//
//public class variableinit {
//    static {
//        System.out.println("static { } ");
//    }
//
//    { // 인스턴스 초기화 블럭
//        System.out.println("{ }");
//
//    }
//
//    public static void main(String[] args) {
//        Sample sample = new Sample();
//        Sample sample2 = new Sample();
//    }
//}
//
//class Document {
//    static int count = 0;
//    String name;
//    Document() {
//        this.("제목없음" + ++count);
//    }
//    Document(String name) {
//        this.name = name;
//        System.out.println("문서 " + this.name + " 가 생성되었습니다.");
//    }
//}
//
//
//public class Sample {
//    public static void main(String[] args) {
//        Document d1 = new Document();
//        Document d2 = new Document("java.txt");
//        Document d3 = new Document("python.txt");
//        Document d4 = new Document();
//    }
//}
