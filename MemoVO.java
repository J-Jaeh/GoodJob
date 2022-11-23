import java.time.LocalDate;

public class MemoVO {
    //변수
    private static int memoNum;  //입력할 글번호????? >글번호 증가할 때 사용할 변수..?
    private int no;                        //특정메모의 글번호 ????>인덱스 넘버..?
    private String  name;
    private String password;
    private String content;
    private LocalDate memodate;//임시

    // 메소드 (생성자)
    public MemoVO(String name, String password, String content) {
        //사용자가주는거
        this.name = name;
        this.password = password;
        this.content = content;

        no = ++memoNum; //글번호 1씩 자동으로 증가시키기
        this.memodate = LocalDate.now();  //<<이렇게 하면 되는거…맞겠죠?
    }
    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getContent() {
        return content;
    }
    public LocalDate getMemodate() {
        return memodate;
    }
}