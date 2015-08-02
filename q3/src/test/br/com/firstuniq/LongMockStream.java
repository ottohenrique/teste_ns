package test.br.com.firstuniq;

import br.com.firstuniq.Stream;

public class LongMockStream implements Stream {

	private MockStream mock;
	private String msg = "VGu\\OFd08_7St1J7oemEsFNwy93AHRZJGPhIDDMye6Gg]Qx\\0soUrq_kqW_OT\\Ah7\\9_mJXc8JIUYwp[dfDAnjIR2IcmfOyjfmmvk`9zm5RX408kByV^uTM91k4poFm7f58^ex7blvAV7_SRJRSM0ujNgc[Of067Kxy1I_rJrjHkv9OjFToNw^GYgAGIu16T7[Ker7MVSZSoNBqMa7tFd2GKu[i4GadFVGo3yC_8w`uCKh]LaS6[oXnNmGEc[8lSTiPkJPJtv[00pUjdsl8_Nzy26paZ\\92JDO8PSjet3UCRjhBACfGb`p4pWvHtfRe_TJe]g^[F]hn^o[bLXccDY\\HQnPfeHPnR_[JiQAJWP]TEX6002iV[]md5qDPeVS7m1kF8X^0OQIdQoZqQHavltcrM9qpSCHqPmLR7r9W6S8JOtVoj_obuKGLUzjLuf3ELul9sbIQGSIz8ImHC4wVqz6mb1l1Kg\\mdWfetEb_553]xf1TwjIDa64dMR9^aZuL4[2UNGInOWU4hJwAecn142aGJ\\Dbx4Yrb8j5kKwbIcEvijZq8Fh2E[Z1SRL_uI7k5Gd0lGgD[e0R`kbwjP`8Ovvnm7Jw70en\\uvrCGthlhD5Gh4ybLEQO3l``ihckSdU6kleeKPA1SW7pb\\nn0ORX7a]k8LVM[p\\2u9N\\fh2Qu888G]a2yejFjq[fVKcc\\90qFXXDEccCAkay[H`2fbCFh0ZGWuFs\\FiOjQMKJPaGUAaObA\\TyfxBq[0slERyWTO[tFw\\aKTnLRx5uXiBLGWse6Uzk7xWaP5yskoKi7g0\\uW4jxrqc]2orl_ajuDDRfpDkw]eyQVYJ5bAgP2mrRsto^DGUIKGCetYor13rKj34SV\\^w18C57Lf4``L`Z^gMAkHSRYcaosb\\5VJ7oni]0kIVYlVShBfq4F_5o95cmwu9PYBlpcKcVrhWONzwu8uaRX4pIjY6dbYXcbE4XBv4vNhpP`6RdUPF^kZAyxY7gslyV3bboEzO4R0F8\\Afz4FUz_iEbg^GLOnLoZRrOu_g47I[fT`^7K7rS^[pATEmz59P0C[8^e`YtlIFXbvW2bjchnF9MRs`mV76C4qCN2SvCN2inSFGPmjhiBddkkmUVdV[WhgseTz]p`wOkThUvwx[D[910oGvTjorciqeRDf7m2qSp\\]oE8O]VPInY[Mx1A_UhN3Snsi9Dg[VeQfzD[uQ9]VQ]F63P7Y[aG7^vc1PTZrUaVk5ydlRq04lez5l7GakXo]1LoJrS^sUh1R^sIY3Pvn]QjVVk`phhd]QorXQUSS56hFMacFZJtZUy99x_tdcqercacLYt_iMAmkiy1j^o\\9I170P8Zp`n`Yd]0uaR`QS0I7XGFDGo3xJ9kx^7^2Kd9vB4r5]qAJ87zYFoy0BIMEMFarY7I[IyMy77ffCfz4MTtULu8yIYpf^A1QBLSQHm_a^x8K7YPAKgMeKzfFhq5^TGzC886aFG\\uVbJ9zr7YiEDB5vVWpVcaq]h`k6mIOWURTFu[VU4ZKxOhp8DGj0XOsjX6NT8myKGqt4ATAI0zhX`hnL[uhiFMUGruPId6GgxMUkbBLuGs8oCmMBvNta2BRReFXd9juGMZ2EP2drFT\\OZH2PCtOQa^EML\\n_H8XfUIHl[CashDguRaL38A9kPPpX]`5wNU^A_\\F1bja0xeh\\XZnY8L9Q69o]WKigk4DTvdL2a[QGkvAc69MPwncV]sQL[PSmGO2nO[qnVtw74MHKInlld3T8bu2Opqfs0lQ[NgAoQ53GQqo3]5h6OxSEh3xTCVdTI5b3QRsiGSqD3xCJHuP1UstGgpbZDnuU4ogEwjHldA80_rH6lDcGCD2l7SF[dqjRGXXVjOY7x`2DKOZjnY3sxlBx5BnxETJaR8aDnoczkUNBybjJAXCSvvoo2lIF7eaN2C_Xf[XWd`e]cprGMmZZjMf4BVxMHpxt6KG6sskdgMcy39m7B6dBzsL_kW6B8pX6WfpXkFH06Ufn]pQjCOVvK^4BmUXN_^1iPzAZkL0fXaYstEr]WotrRsLxQ";
	
	public LongMockStream() {
		mock = new MockStream(msg);
	}

	@Override
	public char getNext() {
		return mock.getNext();
	}

	@Override
	public boolean hasNext() {
		return mock.hasNext();
	}

}
