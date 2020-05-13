package com.jungchiro.poli.mypage.model.dao;

import java.util.List;

import com.jungchiro.poli.mypage.model.dto.BillFavDto;

public interface BillFavDao {
	
	String NAMESPACE = "bill_fav.";
	public List<BillFavDto> billFavList(int member_seq);
	public List<BillFavDto> billFavUpdateList(int member_seq);
	public int checkBillFav(String bill_id, int member_seq);
	public int billFavInsert(BillFavDto dto);
	public int cancleBillLike(String bill_id, int member_seq);
	public int billFavDelete(String[] member_seq, int bill_id);

}
