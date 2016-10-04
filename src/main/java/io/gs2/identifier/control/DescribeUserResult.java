package io.gs2.identifier.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.User;

/**
 * ユーザ一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeUserResult {

	/** ユーザ一覧 */
	List<User> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したユーザ数を取得。
	 * 
	 * @return 取得したユーザ数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したユーザ一覧を取得。
	 * 
	 * @return ユーザ一覧
	 */
	public List<User> getItems() {
		return items;
	}
	
	/**
	 * ユーザ一覧を設定。
	 * 
	 * @param items ユーザ一覧
	 */
	public void setItems(List<User> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeUserRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
