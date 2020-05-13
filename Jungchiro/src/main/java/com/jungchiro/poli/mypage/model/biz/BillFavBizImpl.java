package com.jungchiro.poli.mypage.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jungchiro.poli.mypage.model.dao.BillFavDao;
import com.jungchiro.poli.mypage.model.dto.BillFavDto;

@Service
public class BillFavBizImpl implements BillFavBiz {
	
	@Autowired
	private BillFavDao dao;

	@Override
	public List<BillFavDto> billFavList(int member_seq) {
		return dao.billFavList(member_seq);
	}

	@Override
	public List<BillFavDto> billFavUpdateList(int member_seq) {
		return dao.billFavUpdateList(member_seq);
	}

	@Override
	public int checkBillFav(String bill_id, int member_seq) {
		return dao.checkBillFav(bill_id, member_seq);
	}

	@Override
	public int billFavInsert(BillFavDto dto) {
		return dao.billFavInsert(dto);
	}

	@Override
	public int cancleBillLike(String bill_id, int member_seq) {
		return dao.cancleBillLike(bill_id, member_seq);
	}

	@Override
	public int billFavDelete(String[] member_seq, int bill_id) {
		return dao.billFavDelete(member_seq, bill_id);
	}

}
