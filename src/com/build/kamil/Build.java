package com.build.kamil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Build {

	public static void main(String[] args) throws IOException {
		CollectUserData collect = new CollectUserData();
		Map<Integer, UserData> usermap = new TreeMap<Integer, UserData>();

		UserData userdata1 = new UserData("Kamil", "Jankowski", "kjankowski", "paswd", "admin");
		UserData userdata2 = new UserData("Daniel", "Jankowski", "djankowski", "paswd", "user");
		UserData userdata3 = new UserData("Hubert", "Jankowski", "hjankowski", "paswd", "user");

		usermap.put(1, userdata1);
		usermap.put(2, userdata2);
		usermap.put(3, userdata3);

		// String[] s = CollectUserData.userName;

		GenerateXML genereateXML = new GenerateXML();

		String prolog = genereateXML.generateProlog();
		String generateOpenUserTag = genereateXML.generateOpenUserTag();
		for (Map.Entry<Integer, UserData> entry : usermap.entrySet()) {
			int key = entry.getKey();
			UserData ud = entry.getValue();
			System.out.println(key + " " + ud.getName() + " " + ud.getSurname() + " " + ud.getLogin() + " "
					+ ud.getPassword() + " " + ud.getRole());
		}
		// String name1 = genereateXML.generateName(userdata.getName());
		String generateCloseUserTag = genereateXML.generateCloseUserTag();

		System.out.println(prolog);
		System.out.println(generateOpenUserTag);

		System.out.println(CollectUserData.name);

		System.out.println(generateCloseUserTag);

		File filexml = new File("c:/share/index.xml");
		FileWriter fw = new FileWriter(filexml);

		fw.write(prolog + "\n");

		for (Map.Entry<Integer, UserData> entry : usermap.entrySet()) {
			int key = entry.getKey();
			UserData ud = entry.getValue();

			fw.write(generateOpenUserTag + "\n");

			fw.write("\t" + genereateXML.generateName(ud.getName()) + "\n");
			fw.write("\t" + genereateXML.generateSurname(ud.getSurname()) + "\n");
			fw.write("\t" + genereateXML.generateLogin(ud.getLogin()) + "\n");
			fw.write("\t" + genereateXML.generatePassword(ud.getPassword()) + "\n");
			fw.write("\t" + genereateXML.generateRole(ud.getRole()) + "\n");

			fw.write(generateCloseUserTag + "\n");
		}

		fw.close();

	}

}
