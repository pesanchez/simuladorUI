package com.pesanchez.simulador;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;


@DesignRoot
public class SimuladorDesign extends CssLayout {
	private static final long serialVersionUID = 2641488529921129047L;
	
	protected CssLayout clyDatosProducto;
	protected ComboBox cmbSubproducto;
	protected TextField txtMonto;
	protected TextField txtCantidadPlazo;
	protected ComboBox cmbPlazo;
	protected TextField txtTasa;
	protected TextField txtValorComercial;
	protected TextField txtDiaPago;
	protected TextField txtGracia;
	protected ComboBox cmbUnidadPlazoGracia;
	protected CssLayout clyPeriodicidades;
	protected Label lblPeriodicidad;
	protected TextField txtPrincipal;
	protected ComboBox cmbUnidadPlazoPrincipal;
	protected TextField txtInteresGracia;
	protected ComboBox cmbUnidadInteresGracia;
	protected CssLayout clyTipoCuotas;
	protected Label lblCuotas;
	protected OptionGroup optCuotas;
	protected CssLayout clyMesesAdicionales;
	protected ComboBox cmbUnidadPlazoAdicionalesMesUno;
	protected TextField txtCuotaAdicionalMesUno;
	protected ComboBox cmbUnidadPlazoAdicionalesMesDos;
	protected TextField txtCuotaAdicionalMesDos;
	protected ComboBox cmbUnidadPlazoAdicionalesMesTres;
	protected TextField txtCuotaAdicionalMesTres;
	protected ComboBox cmbUnidadPlazoAdicionalesMesCuatro;
	protected TextField txtCuotaAdicionalMesCuatro;
	protected CssLayout clyDatosSeguro;
	protected ComboBox cmbTipoSeguro;
	protected ComboBox cmbTipoBien;
	protected ComboBox cmbTipoDesgravamen;
	protected PopupDateField pdfNacimientoTitularUno;
	protected PopupDateField pdfNacimientoTitularDos;
//	protected CssLayout clyAdicionalesCronograma;
	protected CheckBox chkEnvioFisico;
//	protected CheckBox chkGraciaCapitalizacion;
	protected CssLayout clyBotonera;
	protected Button btnSimular;
	
	public SimuladorDesign() {
		Design.read(this);
		cargarEstadosIniciales();
	}

	private void cargarEstadosIniciales() {
		cmbTipoSeguro.setEnabled(true);
		cmbTipoBien.setVisible(false);
		cmbTipoBien.setEnabled(false);
		cmbTipoDesgravamen.setVisible(false);
		cmbTipoDesgravamen.setEnabled(false);
		
		clyMesesAdicionales.setVisible(true);
		clyMesesAdicionales.setEnabled(true);		
		pdfNacimientoTitularUno.setEnabled(false);
		pdfNacimientoTitularUno.setVisible(false);
		pdfNacimientoTitularDos.setEnabled(false);
		pdfNacimientoTitularDos.setVisible(false);
		optCuotas.select("Simples");
	}
}