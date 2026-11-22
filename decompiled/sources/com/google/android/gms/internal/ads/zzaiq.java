package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import com.mrgames.larvaheroesfree.R;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaiq implements zzaio {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzace zzc;
    private final zzakd zzd;
    private final zzfb zze;
    private final zzajd zzf;
    private final boolean[] zzg;
    private final zzaip zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaiq() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        long j;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        long j2;
        double d;
        int i5;
        int i6;
        zzdy.zzb(this.zzc);
        int iZzc = zzfbVar.zzc();
        int iZzd = zzfbVar.zzd();
        byte[] bArrZzI = zzfbVar.zzI();
        this.zzi += (long) zzfbVar.zza();
        this.zzc.zzq(zzfbVar, zzfbVar.zza());
        while (true) {
            int iZza = zzfy.zza(bArrZzI, iZzc, iZzd, this.zzg);
            if (iZza == iZzd) {
                break;
            }
            int i7 = iZza + 3;
            int i8 = zzfbVar.zzI()[i7] & 255;
            int i9 = iZza - iZzc;
            if (!this.zzk) {
                if (i9 > 0) {
                    this.zzh.zza(bArrZzI, iZzc, iZza);
                }
                if (this.zzh.zzc(i8, i9 < 0 ? -i9 : 0)) {
                    zzaip zzaipVar = this.zzh;
                    String str = this.zzb;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaipVar.zzc, zzaipVar.zza);
                    int i10 = bArrCopyOf[4] & 255;
                    int i11 = bArrCopyOf[5] & 255;
                    int i12 = bArrCopyOf[6] & 255;
                    int i13 = i11 & 15;
                    int i14 = (i11 >> 4) | (i10 << 4);
                    int i15 = (bArrCopyOf[7] & 240) >> 4;
                    int i16 = (i13 << 8) | i12;
                    if (i15 == 2) {
                        i2 = i16 * 4;
                        i3 = i14 * 3;
                    } else if (i15 != 3) {
                        if (i15 != 4) {
                            f = 1.0f;
                        } else {
                            i2 = i16 * R.styleable.AppCompatTheme_windowFixedHeightMinor;
                            i3 = i14 * 100;
                        }
                        zzak zzakVar = new zzak();
                        zzakVar.zzH(str);
                        zzakVar.zzS("video/mpeg2");
                        zzakVar.zzX(i14);
                        zzakVar.zzF(i16);
                        zzakVar.zzP(f);
                        zzakVar.zzI(Collections.singletonList(bArrCopyOf));
                        zzam zzamVarZzY = zzakVar.zzY();
                        i4 = (bArrCopyOf[7] & Ascii.SI) - 1;
                        j2 = 0;
                        if (i4 >= 0 && i4 < 8) {
                            d = zza[i4];
                            byte b = bArrCopyOf[zzaipVar.zzb + 9];
                            i5 = (b & 96) >> 5;
                            i6 = b & Ascii.US;
                            if (i5 != i6) {
                                double d2 = i5;
                                Double.isNaN(d2);
                                double d3 = i6 + 1;
                                Double.isNaN(d3);
                                d *= (d2 + 1.0d) / d3;
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(zzamVarZzY, Long.valueOf(j2));
                        this.zzc.zzk((zzam) pairCreate.first);
                        this.zzl = ((Long) pairCreate.second).longValue();
                        this.zzk = true;
                    } else {
                        i2 = i16 * 16;
                        i3 = i14 * 9;
                    }
                    f = i2 / i3;
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzH(str);
                    zzakVar2.zzS("video/mpeg2");
                    zzakVar2.zzX(i14);
                    zzakVar2.zzF(i16);
                    zzakVar2.zzP(f);
                    zzakVar2.zzI(Collections.singletonList(bArrCopyOf));
                    zzam zzamVarZzY2 = zzakVar2.zzY();
                    i4 = (bArrCopyOf[7] & Ascii.SI) - 1;
                    j2 = 0;
                    if (i4 >= 0) {
                        d = zza[i4];
                        byte b2 = bArrCopyOf[zzaipVar.zzb + 9];
                        i5 = (b2 & 96) >> 5;
                        i6 = b2 & Ascii.US;
                        if (i5 != i6) {
                            double d4 = i5;
                            Double.isNaN(d4);
                            double d5 = i6 + 1;
                            Double.isNaN(d5);
                            d *= (d4 + 1.0d) / d5;
                        }
                        j2 = (long) (1000000.0d / d);
                    }
                    Pair pairCreate2 = Pair.create(zzamVarZzY2, Long.valueOf(j2));
                    this.zzc.zzk((zzam) pairCreate2.first);
                    this.zzl = ((Long) pairCreate2.second).longValue();
                    this.zzk = true;
                }
            }
            zzajd zzajdVar = this.zzf;
            if (zzajdVar != null) {
                if (i9 > 0) {
                    zzajdVar.zza(bArrZzI, iZzc, iZza);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (this.zzf.zzd(i)) {
                    zzajd zzajdVar2 = this.zzf;
                    int iZzb = zzfy.zzb(zzajdVar2.zza, zzajdVar2.zzb);
                    zzfb zzfbVar2 = this.zze;
                    int i17 = zzfk.zza;
                    zzfbVar2.zzE(this.zzf.zza, iZzb);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if (i8 == 178) {
                    if (zzfbVar.zzI()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i18 = iZzd - iZza;
                if (this.zzq && this.zzk) {
                    long j3 = this.zzo;
                    if (j3 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.zzc.zzs(j3, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i18, i18, null);
                    } else {
                        j = -9223372036854775807L;
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.zzj || this.zzq) {
                    this.zzn = this.zzi - ((long) i18);
                    long j4 = this.zzm;
                    if (j4 == j) {
                        long j5 = this.zzo;
                        j4 = j5 != j ? j5 + this.zzl : j;
                    }
                    this.zzo = j4;
                    this.zzp = false;
                    this.zzm = j;
                    this.zzj = true;
                }
                this.zzq = i8 == 0;
            } else {
                if (i8 == 184) {
                    this.zzp = true;
                }
                iZzd = iZzd;
                bArrZzI = bArrZzI;
            }
            iZzd = iZzd;
            bArrZzI = bArrZzI;
            iZzc = i7;
        }
        if (!this.zzk) {
            this.zzh.zza(bArrZzI, iZzc, iZzd);
        }
        zzajd zzajdVar3 = this.zzf;
        if (zzajdVar3 != null) {
            zzajdVar3.zza(bArrZzI, iZzc, iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzb = zzakaVar.zzb();
        this.zzc = zzabeVar.zzv(zzakaVar.zza(), 2);
        zzakd zzakdVar = this.zzd;
        if (zzakdVar != null) {
            zzakdVar.zzb(zzabeVar, zzakaVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        zzfy.zzf(this.zzg);
        this.zzh.zzb();
        zzajd zzajdVar = this.zzf;
        if (zzajdVar != null) {
            zzajdVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzaiq(zzakd zzakdVar) {
        zzfb zzfbVar;
        this.zzd = zzakdVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaip(128);
        if (zzakdVar != null) {
            this.zzf = new zzajd(178, 128);
            zzfbVar = new zzfb();
        } else {
            zzfbVar = null;
            this.zzf = null;
        }
        this.zze = zzfbVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
