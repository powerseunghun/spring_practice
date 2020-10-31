package org.zeorck.service;

import java.util.List;

import org.zeorck.domain.Criteria;
import org.zeorck.domain.ReplyPageDTO;
import org.zeorck.domain.ReplyVO;

public interface ReplyService {
	public int register(ReplyVO vo);
	
	public ReplyVO get(Long rno);
	
	public int modify(ReplyVO vo);
	
	public int remove(Long rno);
	
	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);
}
