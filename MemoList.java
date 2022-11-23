public class memoList {
    Private arrayList memos;

    public memosNo(int no) {
        memos = new arrayList();
    }

    private void addMemo(Memo memo) {
        memos.addLast(memo);
    }

    public void newMemo(int memoNum) {
        String name, password, content;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("비밀번호 : ");
        password = sc.nextLine();
        System.out.print("내용 : ");
        content = sc.nextLine();
    }

    public void showAllMemos() {

    }

    public void updateMemo(int memoNum) {
        // memoNum 받아와서서
        // 시간 수정
        // 내용 수정

    }

    public void deleteMemo(int memoNum) {
        // memoNum 받아와서 삭제하고, 해당 값 찾으면 없다는 문구 안내
    }

    public MemoVO getMemoByPassWord(int delnum) {

        String pw = memos.get(delnum).getPassWord();

        return  pw
    }

    Public void showAlMemos(){
        for (int i =0; i< meos.size();i++){
            System.out.println(“글번호 = ” + meos.get(i).getNo));
            System.out.println(“작성자 = ” + meos.get(i).getName());
            System.out.println(“내용  = ” + meos.get(i).getContent().substring(0,10);
            System.out.println(“작성일자 = ” + meos.get(i).getName());
            System.out.println(“-------------------------------------”);
        }
    }

    Public Boolean checkMeoExistOrNot(int memoNumuP){
             //~~
            retrun 불린값
        }
}

