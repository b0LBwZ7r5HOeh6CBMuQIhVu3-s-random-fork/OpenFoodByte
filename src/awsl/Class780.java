/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 */
package awsl;

import awsl.Class102;
import awsl.Class104;
import awsl.Class112;
import awsl.Class116;
import awsl.Class122;
import awsl.Class15;
import awsl.Class45;
import awsl.Class731;
import awsl.Class784;
import awsl.Class786;
import awsl.Class794;
import awsl.Class796;
import awsl.Class82;
import awsl.Class96;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class780
implements Class45 {
    private final Class786 Field3475;
    private int Field3476;
    private Class116 Field3477;
    private List[] Field3478;
    private Class784[] Field3479;
    private Class796[] Field3480;
    private boolean[] Field3481;
    private int[] Field3482;
    private int Field3483;

    public Class780(Class786 a) {
        this.Field3475 = a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Class784[] Method847(String a, Class15 a) throws Class731 {
        block49: {
            block50: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                a = Class786.Method917();
                                                if ((a.Field194 & 1280) != 0) {
                                                    this.Field3479 = new Class784[0];
                                                    return this.Field3479;
                                                }
                                                this.Field3476 = a.Field208.Method183();
                                                this.Field3477 = a.Field208;
                                                this.Field3478 = new List[this.Field3476];
                                                this.Field3479 = new Class784[this.Field3476];
                                                this.Field3480 = new Class796[this.Field3476];
                                                this.Field3481 = new boolean[this.Field3476];
                                                this.Field3482 = new int[this.Field3476];
                                                this.Field3483 = 0;
                                                a = 0;
                                                if (a < a.Field209.Method1799()) {
                                                    a = (Class794)a.Field209.get(a);
                                                    a = this.Field3477.Method188(a.Field3559);
                                                    a = a;
                                                    if (a < (a = this.Field3477.Method188(a.Field3560))) {
                                                        a = this.Field3478[a];
                                                        a = new ArrayList();
                                                        this.Field3478[a] = a;
                                                        a.Method2530((Object)a);
                                                        ++a;
                                                    }
                                                    ++a;
                                                }
                                                a = new Class796(null, a.Field211, null);
                                                a = new ArrayList();
                                                a = new HashMap();
                                                this.Method848(0, a, (List)a);
                                                if (!a.isEmpty()) {
                                                    a = (Class102)a.remove(0);
                                                    a = (Class796)a.Method2665((Object)a.Field829);
                                                    a = new Class796(a.Field829, a.Field211, a);
                                                    a.put((Object)a.Field829, (Object)a);
                                                    this.Method848(this.Field3477.Method188(a.Field829), a, (List)a);
                                                    a.Field3567.Method2530((Object)a);
                                                }
                                                if ((a = 0) < this.Field3476) {
                                                    if (this.Field3480[a] != null && this.Field3480[a].Field3565 == null) {
                                                        this.Field3480[a] = null;
                                                    }
                                                    ++a;
                                                }
                                                a = this.Method852(a.Field211, a.Field210);
                                                a = this.Method852(a.Field211, a.Field210);
                                                a.Method885(this.Field3475.Method907(b.Method3213(a.Field196)));
                                                a = b.Method3211(a.Field196);
                                                a = 0;
                                                if ((a.Field194 & 8) == 0) {
                                                    a = b.Method3205(a);
                                                    a.Method889(a++, this.Field3475.Method907(a));
                                                }
                                                if ((a = 0) < a.length) {
                                                    a.Method889(a++, this.Field3475.Method907(a[a]));
                                                    if (a[a].Method3233() == 2) {
                                                        a.Method889(a++, this.Field3475.Method907(null));
                                                    }
                                                    ++a;
                                                }
                                                if (a < a.Field211) {
                                                    a.Method889(a++, this.Field3475.Method907(null));
                                                }
                                                this.Method857(0, a, null);
                                                this.Method851(a, a);
                                                if (this.Field3483 <= 0) break block49;
                                                a = this.Field3482[--this.Field3483];
                                                a = this.Field3479[a];
                                                a = this.Field3480[a];
                                                this.Field3481[a] = false;
                                                a = null;
                                                a = a.Field208.Method186(a);
                                                a = a.Method3640();
                                                a = a.Method0();
                                                if (a == 8 || a == 15) break block41;
                                                if (a != 14) break block42;
                                            }
                                            this.Method857(a + 1, a, a);
                                            this.Method854(a, a + 1);
                                        }
                                        a.Method884(a).Method895(a, this.Field3475);
                                        v0 = null;
                                        a = v0;
                                        if (!(a instanceof Class102)) ** GOTO lbl113
                                        a /* !! */  = (Class102)a;
                                        if (a == 167 || a == 168) break block43;
                                        this.Method857(a + 1, a, a);
                                        this.Method854(a, a + 1);
                                    }
                                    a = this.Field3477.Method188(a /* !! */ .Field829);
                                    if (a != 168) break block44;
                                    this.Method857(a, a, new Class796(a /* !! */ .Field829, a.Field211, a /* !! */ ));
                                }
                                this.Method857(a, a, a);
                                this.Method854(a, a);
lbl113:
                                // 2 sources

                                if (!(a instanceof Class96)) ** GOTO lbl128
                                a /* !! */  = (Class96)a;
                                a = this.Field3477.Method188(a /* !! */ .Field817);
                                this.Method857(a, a, a);
                                this.Method854(a, a);
                                a = 0;
                                if (a < a /* !! */ .Field819.Method1799()) {
                                    a = (Class104)a /* !! */ .Field819.get(a);
                                    a = this.Field3477.Method188((a)a);
                                    this.Method857(a, a, a);
                                    this.Method854(a, a);
                                    ++a;
                                }
lbl128:
                                // 4 sources

                                if (!(a instanceof Class122)) ** GOTO lbl143
                                a /* !! */  = (Class122)a;
                                a = this.Field3477.Method188(a /* !! */ .Field961);
                                this.Method857(a, a, a);
                                this.Method854(a, a);
                                a = 0;
                                if (a < a /* !! */ .Field962.Method1799()) {
                                    a = (Class104)a /* !! */ .Field962.get(a);
                                    a = this.Field3477.Method188((a)a);
                                    this.Method857(a, a, a);
                                    this.Method854(a, a);
                                    ++a;
                                }
lbl143:
                                // 4 sources

                                if (a != 169) break block45;
                                throw new Class731(a, "RET instruction outside of a sub routine");
                            }
                            if (a == 191) ** GOTO lbl180
                            if (a < 172) break block46;
                            if (a <= 177) ** GOTO lbl180
                        }
                        if (!(a instanceof Class112)) ** GOTO lbl174
                        a = ((Class112)a).Field877;
                        a.Field3566[a] = true;
                        if (a == 22 || a == 24) break block47;
                        if (a == 55) break block47;
                        if (a != 57) break block48;
                    }
                    a.Field3566[a + 1] = true;
                }
lbl174:
                // 2 sources

                if (!(a instanceof Class82)) ** GOTO lbl178
                a = ((Class82)a).Field712;
                a.Field3566[a] = true;
lbl178:
                // 2 sources

                this.Method857(a + 1, a, a);
                this.Method854(a, a + 1);
lbl180:
                // 3 sources

                a = this.Field3478[a];
                a = 0;
                if (a >= a.Method1799()) break block49;
                a = (Class794)a.get(a);
                if (a.Field3562 == null) {
                    a = b.Method3205("java/lang/Throwable");
                }
                a = b.Method3205(a.Field3562);
                a = this.Field3477.Method188(a.Field3561);
                if (!this.Method856(a, a)) break block50;
                a.Method884(a);
                a.Method892();
                a.Method894(this.Field3475.Method907((b)a));
                this.Method857(a, a, a);
            }
            try {
                ++a;
            }
            catch (Class731 a) {
                throw new Class731(a.Field3210, "Error at instruction " + a + ": " + a.getMessage(), (Throwable)a);
            }
            catch (Exception a) {
                throw new Class731(a, "Error at instruction " + a + ": " + a.getMessage(), a);
            }
        }
        return this.Field3479;
    }

    private void Method848(int a2, Class796 a3, List a4) throws Class731 {
        while (true) {
            Object a5;
            int a6;
            a a7;
            if (a2 >= this.Field3476) {
                throw new Class731(null, "Execution can fall off end of the code");
            }
            if (this.Field3480[a2] != null) {
                return;
            }
            this.Field3480[a2] = a3.Method807();
            a a8 = this.Field3477.Method186(a2);
            if (a8 instanceof Class102) {
                if (a8.Method3640() == 168) {
                    a4.Method2530((Object)a8);
                } else {
                    a7 = (Class102)a8;
                    this.Method848(this.Field3477.Method188(((Class102)a7).Field829), a3, a4);
                }
            } else {
                if (a8 instanceof Class122) {
                    a7 = (Class122)a8;
                    this.Method848(this.Field3477.Method188(a7.Field961), a3, a4);
                    a6 = a7.Field962.Method1799() - 1;
                    while (true) {
                        a5 = (Class104)a7.Field962.get(a6);
                        this.Method848(this.Field3477.Method188((a)a5), a3, a4);
                        --a6;
                    }
                }
                if (a8 instanceof Class96) {
                    a7 = (Class96)a8;
                    this.Method848(this.Field3477.Method188(((Class96)a7).Field817), a3, a4);
                    a6 = ((Class96)a7).Field819.Method1799() - 1;
                    while (true) {
                        a5 = (Class104)((Class96)a7).Field819.get(a6);
                        this.Method848(this.Field3477.Method188((a)a5), a3, a4);
                        --a6;
                    }
                }
            }
            a7 = this.Field3478[a2];
            for (a6 = 0; a6 < a7.Method1799(); ++a6) {
                a5 = (Class794)a7.get(a6);
                this.Method848(this.Field3477.Method188(((Class794)a5).Field3561), a3, a4);
            }
            switch (a8.Method3640()) {
                case 167: 
                case 169: 
                case 170: 
                case 171: 
                case 172: 
                case 173: 
                case 174: 
                case 175: 
                case 176: 
                case 177: 
                case 191: {
                    return;
                }
            }
            ++a2;
        }
    }

    public Class784[] Method849() {
        return this.Field3479;
    }

    public List Method850(int a2) {
        return this.Field3478[a2];
    }

    protected void Method851(String a2, Class15 a3) throws Class731 {
    }

    protected Class784 Method852(int a2, int a3) {
        return new Class784(a2, a3);
    }

    protected Class784 Method853(Class784 a2) {
        return new Class784(a2);
    }

    protected void Method854(int a2, int a3) {
    }

    protected boolean Method855(int a2, int a3) {
        return true;
    }

    protected boolean Method856(int a2, Class794 a3) {
        return this.Method855(a2, this.Field3477.Method188(a3.Field3561));
    }

    private void Method857(int a2, Class784 a3, Class796 a4) throws Class731 {
        block0: {
            Class784 a5 = this.Field3479[a2];
            Class796 a6 = this.Field3480[a2];
            this.Field3479[a2] = this.Method853(a3);
            boolean a7 = true;
            this.Field3480[a2] = a4.Method807();
            a7 = true;
            if (this.Field3481[a2]) break block0;
            this.Field3481[a2] = true;
            this.Field3482[this.Field3483++] = a2;
        }
    }

    private void Method858(int a2, Class784 a3, Class784 a4, Class796 a5, boolean[] a6) throws Class731 {
        block0: {
            Class784 a7 = this.Field3479[a2];
            Class796 a8 = this.Field3480[a2];
            a4.Method897(a3, a6);
            this.Field3479[a2] = this.Method853(a4);
            boolean a9 = true;
            a9 |= a8.Method808(a5);
            if (this.Field3481[a2]) break block0;
            this.Field3481[a2] = true;
            this.Field3482[this.Field3483++] = a2;
        }
    }

    private static Class731 Method859(Class731 class731) {
        return class731;
    }
}