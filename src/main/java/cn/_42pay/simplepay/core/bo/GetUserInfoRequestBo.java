package cn._42pay.simplepay.core.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kevin on 2018/6/26.
 */
@Getter
@Setter
public class GetUserInfoRequestBo extends PayBaseRequestBo{
	private String accessToken;
}
