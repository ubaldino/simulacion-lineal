package org.simulacion.ecuacionlineal;

import java.lang.reflect.Method;
import org.apache.commons.lang3.StringUtils;

public class Recta {
	private double A;
	private double B;
	private double C;
	
	private double P;
	private double Q;
	
	private double pendiente;
	private double angulo;
	
	public Recta(Double A, Double B, Double C) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.P = Double.NaN;
		this.Q = Double.NaN;
		this.pendiente = Double.NaN;
		this.angulo = Double.NaN;
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}

	public double getP() {
		return P;
	}

	public void setP(double p) {
		P = p;
	}

	public double getQ() {
		return Q;
	}

	public void setQ(double q) {
		Q = q;
	}

	public double getPendiente() {
		return pendiente;
	}

	public void setPendiente(double pendiente) {
		this.pendiente = pendiente;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	
	private boolean isNegativo(double x) {
		return Double.doubleToLongBits(x) < 0;
	}
	
	
	public String getFuncionPrincipal() {
		return
			String.format(this.A==0?"":this.isNegativo(this.A)?"-%.0fx":"%.0fx",Math.abs(this.A))
		  + String.format(this.B==0?"":this.isNegativo(this.B)?" - %.0fy":" + %.0fy",Math.abs(this.B))
		  + String.format((this.C==0?"":this.isNegativo(this.C)?" - %.0f":" + %.0f")+" = 0",Math.abs(this.C));
	}

	public String toString(String tipo) throws Exception {
		Method Metodo = this.getClass().getMethod("getFuncion"+StringUtils.capitalize(tipo));
		return (String) Metodo.invoke(this);
	}	
}
