package vn.gpay.jitin.core.api.porder;

import java.util.List;

import vn.gpay.jitin.core.base.ResponseBase;
import vn.gpay.jitin.core.porder.POrder;

public class porder_getlist_response extends ResponseBase {
	public List<POrder> data;
}
