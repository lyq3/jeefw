package com.jeefw.service.sys.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeefw.dao.sys.AttachmentDao;
import com.jeefw.model.sys.Attachment;
import com.jeefw.service.sys.AttachmentService;

import core.service.BaseService;

/**
 */
@Service
public class AttachmentServiceImpl extends BaseService<Attachment> implements AttachmentService {

	private AttachmentDao attachmentDao;

	@Resource
	public void setAttachmentDao(AttachmentDao attachmentDao) {
		this.attachmentDao = attachmentDao;
		this.dao = attachmentDao;
	}

	@Override
	public List<Object[]> queryFlowerList(String epcId) {
		return attachmentDao.queryFlowerList(epcId);
	}

	@Override
	public void deleteAttachmentByForestryTypeId(Long umTypeId) {
		attachmentDao.deleteAttachmentByForestryTypeId(umTypeId);
	}

	@Override
	public List<Object[]> querySensorList() {
		return attachmentDao.querySensorList();
	}

}
