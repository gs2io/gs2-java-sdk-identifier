package io.gs2.identifier;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.identifier.control.AttachSecurityPolicyRequest;
import io.gs2.identifier.control.CreateIdentifierRequest;
import io.gs2.identifier.control.CreateIdentifierResult;
import io.gs2.identifier.control.CreateSecurityPolicyRequest;
import io.gs2.identifier.control.CreateSecurityPolicyResult;
import io.gs2.identifier.control.CreateUserRequest;
import io.gs2.identifier.control.CreateUserResult;
import io.gs2.identifier.control.DeleteIdentifierRequest;
import io.gs2.identifier.control.DeleteSecurityPolicyRequest;
import io.gs2.identifier.control.DeleteUserRequest;
import io.gs2.identifier.control.DescribeCommonSecurityPolicyRequest;
import io.gs2.identifier.control.DescribeCommonSecurityPolicyResult;
import io.gs2.identifier.control.DescribeIdentifierRequest;
import io.gs2.identifier.control.DescribeIdentifierResult;
import io.gs2.identifier.control.DescribeSecurityPolicyRequest;
import io.gs2.identifier.control.DescribeSecurityPolicyResult;
import io.gs2.identifier.control.DescribeUserRequest;
import io.gs2.identifier.control.DescribeUserResult;
import io.gs2.identifier.control.DetachSecurityPolicyRequest;
import io.gs2.identifier.control.GetHasSecurityPolicyRequest;
import io.gs2.identifier.control.GetHasSecurityPolicyResult;
import io.gs2.identifier.control.GetSecurityPolicyRequest;
import io.gs2.identifier.control.GetSecurityPolicyResult;
import io.gs2.identifier.control.GetUserRequest;
import io.gs2.identifier.control.GetUserResult;
import io.gs2.identifier.control.UpdateSecurityPolicyRequest;
import io.gs2.identifier.control.UpdateSecurityPolicyResult;
import io.gs2.model.IGs2Credential;

/**
 * GS2 Identifier API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2IdentifierClient extends AbstractGs2Client<Gs2IdentifierClient> {

	public static String ENDPOINT = "identifier";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2IdentifierClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * ユーザを作成。
	 * 
	 * GS2のサービスを利用するにはユーザを作成する必要があります。<br>
	 * ユーザを作成後、ユーザに対して権限設定を行い、ユーザに対応したGSI(クライアントID/シークレット)を発行することでAPIが利用できるようになります。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateUserResult createUser(CreateUserRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/user", 
				credential, 
				ENDPOINT,
				CreateUserRequest.Constant.MODULE, 
				CreateUserRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateUserResult.class);
	}
	
	/**
	 * ユーザ一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ユーザ一覧
	 */
	public DescribeUserResult describeUser(DescribeUserRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/user";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeUserRequest.Constant.MODULE, 
				DescribeUserRequest.Constant.FUNCTION);
		return doRequest(get, DescribeUserResult.class);
	}

	/**
	 * ユーザを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ユーザ
	 */
	public GetUserResult getUser(GetUserRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName(), 
				credential, 
				ENDPOINT,
				GetUserRequest.Constant.MODULE, 
				GetUserRequest.Constant.FUNCTION);
		return doRequest(get, GetUserResult.class);
	}

	/**
	 * ユーザを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteUser(DeleteUserRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName(), 
				credential, 
				ENDPOINT,
				DeleteUserRequest.Constant.MODULE, 
				DeleteUserRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * GSIを作成。
	 * 
	 * GSIはSDKなどでAPIを利用する際に必要となる クライアントID/シークレット です。<br>
	 * AWSでいうIAMのクレデンシャルに相当します。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateIdentifierResult createIdentifier(CreateIdentifierRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode();
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName() + "/identifier", 
				credential, 
				ENDPOINT,
				CreateIdentifierRequest.Constant.MODULE, 
				CreateIdentifierRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateIdentifierResult.class);
	}
	
	/**
	 * GSI一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return GSI一覧
	 */
	public DescribeIdentifierResult describeIdentifier(DescribeIdentifierRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName() + "/identifier";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeIdentifierRequest.Constant.MODULE, 
				DescribeIdentifierRequest.Constant.FUNCTION);
		return doRequest(get, DescribeIdentifierResult.class);
	}

	/**
	 * GSIを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteIdentifier(DeleteIdentifierRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName() + "/identifier/" + request.getIdentifierId(), 
				credential, 
				ENDPOINT,
				DeleteIdentifierRequest.Constant.MODULE, 
				DeleteIdentifierRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * ユーザが保持しているセキュリティポリシー一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return GSI一覧
	 */
	public GetHasSecurityPolicyResult getHasSecurityPolicy(GetHasSecurityPolicyRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName() + "/securityPolicy";
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				GetHasSecurityPolicyRequest.Constant.MODULE, 
				GetHasSecurityPolicyRequest.Constant.FUNCTION);
		return doRequest(get, GetHasSecurityPolicyResult.class);
	}

	/**
	 * ユーザにセキュリティポリシーを割り当てる。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void attachSecurityPolicy(AttachSecurityPolicyRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("securityPolicyId", request.getSecurityPolicyId());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName() + "/securityPolicy", 
				credential, 
				ENDPOINT,
				AttachSecurityPolicyRequest.Constant.MODULE, 
				AttachSecurityPolicyRequest.Constant.FUNCTION,
				body.toString());
		doRequest(put, null);
	}

	/**
	 * ユーザに割り当てられたセキュリティポリシーを解除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void detachSecurityPolicy(DetachSecurityPolicyRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/user/" + request.getUserName() + "/securityPolicy/" + request.getSecurityPolicyId(), 
				credential, 
				ENDPOINT,
				DetachSecurityPolicyRequest.Constant.MODULE, 
				DetachSecurityPolicyRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * セキュリティポリシーを作成。
	 * 
	 * セキュリティポリシーはユーザの権限を定義したものです。<br>
	 * AWSのIAMポリシーに似せて設計されていますが、いくつかAWSのIAMポリシーと比較して劣る点があります。<br>
	 * 2016/9 時点では以下の様な点が IAMポリシー とは異なります。<br>
	 * <ul>
	 * <li>リソースに対するアクセス制御はできません。</li>
	 * <li>アクションのワイルドカードは最後に1箇所のみ利用できます。</li>
	 * </ul>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateSecurityPolicyResult createSecurityPolicy(CreateSecurityPolicyRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("policy", request.getPolicy());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/securityPolicy", 
				credential, 
				ENDPOINT,
				CreateSecurityPolicyRequest.Constant.MODULE, 
				CreateSecurityPolicyRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateSecurityPolicyResult.class);
	}

	/**
	 * セキュリティポリシー一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return セキュリティポリシー一覧
	 */
	public DescribeSecurityPolicyResult describeSecurityPolicy(DescribeSecurityPolicyRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/securityPolicy";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeSecurityPolicyRequest.Constant.MODULE, 
				DescribeSecurityPolicyRequest.Constant.FUNCTION);
		return doRequest(get, DescribeSecurityPolicyResult.class);
	}

	/**
	 * 共用セキュリティポリシー一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 共用セキュリティポリシー一覧
	 */
	public DescribeCommonSecurityPolicyResult describeCommonSecurityPolicy(DescribeCommonSecurityPolicyRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/securityPolicy/common";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeSecurityPolicyRequest.Constant.MODULE, 
				DescribeSecurityPolicyRequest.Constant.FUNCTION);
		return doRequest(get, DescribeCommonSecurityPolicyResult.class);
	}

	/**
	 * セキュリティポリシーを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return セキュリティポリシー
	 */
	public GetSecurityPolicyResult getSecurityPolicy(GetSecurityPolicyRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/securityPolicy/" + request.getSecurityPolicyName(), 
				credential, 
				ENDPOINT,
				GetSecurityPolicyRequest.Constant.MODULE, 
				GetSecurityPolicyRequest.Constant.FUNCTION);
		return doRequest(get, GetSecurityPolicyResult.class);
	}

	/**
	 * セキュリティポリシーを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateSecurityPolicyResult updateSecurityPolicy(UpdateSecurityPolicyRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("policy", request.getPolicy());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/securityPolicy/" + request.getSecurityPolicyName(), 
				credential, 
				ENDPOINT,
				UpdateSecurityPolicyRequest.Constant.MODULE, 
				UpdateSecurityPolicyRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateSecurityPolicyResult.class);
	}

	/**
	 * セキュリティポリシーを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/securityPolicy/" + request.getSecurityPolicyName(), 
				credential, 
				ENDPOINT,
				DeleteSecurityPolicyRequest.Constant.MODULE, 
				DeleteSecurityPolicyRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

}
