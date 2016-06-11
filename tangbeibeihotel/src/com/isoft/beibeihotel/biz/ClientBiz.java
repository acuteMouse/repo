package com.isoft.beibeihotel.biz;

import java.util.Map;

import com.isoft.beibeihotel.dao.ClientDao;
import com.isoft.beibeihotel.entity.Client;

public class ClientBiz {
	private ClientDao clientDao;
	public ClientBiz(){
		clientDao = new ClientDao();
	}
	//住房
	public void clientJoinIn(Client client){
		clientDao.write(client);
	}
	//退房
	public void clientJoinOut(Map<String ,Client> map){
		clientDao.write(map.values());
	}
	//查询
	public Map<String, Client> searchClient(){
		return clientDao.read();
	}
}

