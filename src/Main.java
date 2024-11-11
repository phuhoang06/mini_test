public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
//        programmingBooks
        books[0] = new ProgrammingBook("c01","JAVA01","HoangPhu",100,"Java","A1");
        books[1] = new ProgrammingBook("c02","JAVA02","HoangPhu",99,"PHP","A2");
        books[2] = new ProgrammingBook("c03","JAVA03","HoangPhu",89,"Java","A3");
//        fictionBooks
        books[3] = new FictionBook("c04","Vien Tuong1","HoangPhu",100,"Vien Tuong");
        books[4] = new FictionBook("c05","Vien Tuong2","HoangPhu",120,"Vien Tuong");
        books[5] = new FictionBook("c06","Vien Tuong3","HoangPhu",190,"Vien Tuong");
//        tinh tong tien
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();

        }
        System.out.println("tong so tien la : "+sum);
//        dem so ProgrammingBook
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                ProgrammingBook book = (ProgrammingBook) books[i];
                if (book.getLanguage().equals("Java")) {
                    count++;
                }
            }

        }
        System.out.println("Tong so book co lg la JAVA : "+count);
//        dem so FictionBook
        int count2 = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook book = (FictionBook) books[i];
                if (book.getCategory().equals("Vien Tuong")) {
                    count2++;
                }
            }
        }
        System.out.println("Tong so book vien tuong la : "+count2);
        //    dem so sach fiction co gia duoi 100
        int count3 = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                if (books[i].getPrice()<100){
                    count3++;
                }
            }
        }
        System.out.println("Tong so fictionBook la : "+count3);
    }

}