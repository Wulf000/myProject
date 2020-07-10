package cn.beyond.beyond.entity.globalResponce;

import com.alibaba.fastjson.JSONObject;

public class ResultPageInfo extends ResultInfo{

		private ResultPageInfo() {
			pageIndex = 1;
			pageSize = 10;
			totalCount = 0L;
			totalPages = Integer.valueOf(0);
		}

		private ResultPageInfo(Integer pageIndex, Integer pageSize, Long totalCount) {
			this.pageIndex = 1;
			this.pageSize = 10;
			this.totalCount = 0L;
			totalPages = Integer.valueOf(0);
			this.pageIndex = pageIndex.intValue();
			this.pageSize = pageSize.intValue();
			this.totalCount = totalCount.longValue();
			if (pageSize.intValue() < 0)
				this.pageSize = 20;
		}

		public static ResultPageInfo buildSuccess(Integer pageIndex, Integer pageSize, Long totalCount, Iterable data) {
			ResultPageInfo resultPageInfo = new ResultPageInfo(pageIndex, pageSize, totalCount);
			resultPageInfo.data(data);
			return resultPageInfo;
		}

		public Integer getTotalPages() {
			totalPages = Integer.valueOf((int) (totalCount % (long) pageSize != 0L ? totalCount / (long) pageSize + 1L
					: totalCount / (long) pageSize));
			return totalPages;
		}

		public ResultPageInfo pageIndex(Integer pageIndex) {
			this.pageIndex = pageIndex.intValue();
			return this;
		}

		public int getPageIndex() {
			return pageIndex;
		}

		public ResultPageInfo pageSize(Integer pageSize) {
			this.pageSize = pageSize.intValue();
			return this;
		}

		public int getPageSize() {
			return pageSize;
		}

		public ResultPageInfo totalCount(Long totalCount) {
			this.totalCount = totalCount.longValue();
			return this;
		}

		public long getTotalCount() {
			return totalCount;
		}

		public String toString() {
			return JSONObject.toJSONString(this);
		}

		private static final long serialVersionUID = -4112055105377876700L;
		private int pageIndex;
		private int pageSize;
		private long totalCount;
		private Integer totalPages;

}
