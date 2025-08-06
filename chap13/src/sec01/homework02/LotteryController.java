package sec01.homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LotteryController {
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		lottery.remove(l);
		if (win.contains(l)) {
			if (win.isEmpty()) {
				win.remove(l);
				return true;
			}
		}
		return false;
	}
	
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		if (lottery.size() >= 4) {
			List<Lottery> list = new ArrayList<Lottery>(lottery);
			while (list.size() > 5) {
				int num = (int) (Math.random()*list.size());
				win.add(list.get(num));
			}
			return win;
			// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
			// 기존에 당첨된 사람은 제외
			// 삭제된 사람의 자리만 새로운 추첨자로 채우기
			
		}else {
			return null;
		}
	}
	
	public Set<Lottery> sortedWinObject(){
//		Collections.sort(win);
		return win;
	}
	
	public boolean searchWinner(Lottery l) {
		
		if (win.contains(l)) {
			return true;
		}else {
			return false;			
		}
		
	}
}
