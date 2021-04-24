package Service;

import entity.Member;
import java.util.ArrayList;

public interface MemberService {

    String greet(int i);

    ArrayList<Member> getAll();

    int sumOf(int num_first, int num_last);
}
