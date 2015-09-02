package br.ufpi.rony.sistema.util;

import java.net.MalformedURLException;
import java.net.URL;

import javax.faces.view.facelets.ResourceResolver;

public class FilesystemResourceResolver extends ResourceResolver {

	private static final String PATH_TO_FACELETS_FILES_GOES_HERE = "C://Users//Ronyerison//workspace//sistemaControle//src//main//webapp";

	@Override
	public URL resolveUrl(String path) {
		try {
			return new URL("file", "", PATH_TO_FACELETS_FILES_GOES_HERE + path);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}

}