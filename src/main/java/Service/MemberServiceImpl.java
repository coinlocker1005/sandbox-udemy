package Service;

import entity.Member;
import java.util.ArrayList;

public class MemberServiceImpl implements MemberService{

    @Override
    public String greet(int i){
        String[] greetings = {"Good Morning", "Hello", "Good Evening"};
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll(){
        ArrayList<Member> list = new ArrayList<>();
        Member mem1 = new Member(1, "Linda", "linda@example.com");
        Member mem2 = new Member(2, "James", "james@example.com");
        list.add(mem1);
        list.add(mem2);

        return list;
    }

    @Override
    public int sumOf(int num_first, int num_last) {
        int sum = 0;
        for(int i=num_first; i<=num_last; i++ ){
            sum += i;
        }
        return sum;
    }
}
