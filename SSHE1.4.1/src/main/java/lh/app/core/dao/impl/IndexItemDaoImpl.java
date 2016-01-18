package lh.app.core.dao.impl;

import lh.app.core.dao.IndexItemDaoI;
import lh.app.core.entity.TshopIndexItem;
import lh.base.dao.impl.BaseDaoImpl;

import org.springframework.stereotype.Repository;
@Repository("indexItemDao")
public class IndexItemDaoImpl extends BaseDaoImpl<TshopIndexItem> implements IndexItemDaoI {

}
