package lh.app.core.dao.impl;

import lh.app.core.dao.SiteDaoI;
import lh.app.core.entity.TshopSite;
import lh.base.dao.impl.BaseDaoImpl;

import org.springframework.stereotype.Repository;
@Repository("siteDao")
public class SiteDaoImp extends BaseDaoImpl<TshopSite> implements SiteDaoI {

}
