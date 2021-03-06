package com.TN.Pescheria.IService;

import java.util.List;


import com.TN.Pescheria.Model.Prezzi;

public interface IPrezziService {
	Prezzi inserimentoPrezzo(Prezzi prezzo);
	Prezzi modificaPrezzo(Prezzi prezzo);
	void eliminaPrezzo(int idprezzo);
	List<Prezzi> mostraPrezzo();
}
