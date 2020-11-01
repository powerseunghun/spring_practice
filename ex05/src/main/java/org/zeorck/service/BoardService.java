package org.zeorck.service;

import java.util.List;

import org.zeorck.domain.BoardAttachVO;
import org.zeorck.domain.BoardVO;
import org.zeorck.domain.Criteria;

public interface BoardService {
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
//	public List<BoardVO> getList();
	
	public List<BoardVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	public List<BoardAttachVO> getAttachList(Long bno);
	
}
