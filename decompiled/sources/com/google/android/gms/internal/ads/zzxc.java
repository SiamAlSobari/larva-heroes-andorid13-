package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxc extends zzwz {
    private final boolean zze;
    private final zzwr zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    public zzxc(int i, zzcy zzcyVar, int i2, zzwr zzwrVar, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        byte b;
        boolean z4;
        int i6;
        float f;
        int i7;
        super(i, zzcyVar, i2);
        this.zzf = zzwrVar;
        int i8 = 1;
        int i9 = true != zzwrVar.zzJ ? 16 : 24;
        boolean z5 = zzwrVar.zzI;
        if (z) {
            zzam zzamVar = this.zzd;
            if (zzamVar.zzr != -1) {
                int i10 = zzwrVar.zzd;
            }
            if (zzamVar.zzs != -1) {
                int i11 = zzwrVar.zze;
            }
            float f2 = zzamVar.zzt;
            if (f2 != -1.0f) {
                int i12 = zzwrVar.zzf;
                if (f2 > 2.1474836E9f) {
                    z2 = false;
                }
            }
            if (zzamVar.zzi != -1) {
                int i13 = zzwrVar.zzg;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.zze = z2;
        if (z) {
            zzam zzamVar2 = this.zzd;
            int i14 = zzamVar2.zzr;
            if (i14 != -1) {
                int i15 = zzwrVar.zzh;
                if (i14 >= 0) {
                    i6 = zzamVar2.zzs;
                    if (i6 != -1) {
                        int i16 = zzwrVar.zzi;
                        if (i6 >= 0) {
                            f = zzamVar2.zzt;
                            if (f != -1.0f) {
                                int i17 = zzwrVar.zzj;
                                if (f >= 0.0f) {
                                    i7 = zzamVar2.zzi;
                                    if (i7 != -1) {
                                        int i18 = zzwrVar.zzk;
                                        if (i7 >= 0) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i7 = zzamVar2.zzi;
                                if (i7 != -1) {
                                    int i19 = zzwrVar.zzk;
                                    if (i7 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = zzamVar2.zzt;
                        if (f != -1.0f) {
                            int i110 = zzwrVar.zzj;
                            if (f >= 0.0f) {
                                i7 = zzamVar2.zzi;
                                if (i7 != -1) {
                                    int i111 = zzwrVar.zzk;
                                    if (i7 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i7 = zzamVar2.zzi;
                            if (i7 != -1) {
                                int i112 = zzwrVar.zzk;
                                if (i7 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i6 = zzamVar2.zzs;
                if (i6 != -1) {
                    int i113 = zzwrVar.zzi;
                    if (i6 >= 0) {
                        f = zzamVar2.zzt;
                        if (f != -1.0f) {
                            int i114 = zzwrVar.zzj;
                            if (f >= 0.0f) {
                                i7 = zzamVar2.zzi;
                                if (i7 != -1) {
                                    int i115 = zzwrVar.zzk;
                                    if (i7 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i7 = zzamVar2.zzi;
                            if (i7 != -1) {
                                int i116 = zzwrVar.zzk;
                                if (i7 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = zzamVar2.zzt;
                    if (f != -1.0f) {
                        int i117 = zzwrVar.zzj;
                        if (f >= 0.0f) {
                            i7 = zzamVar2.zzi;
                            if (i7 != -1) {
                                int i118 = zzwrVar.zzk;
                                if (i7 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i7 = zzamVar2.zzi;
                        if (i7 != -1) {
                            int i119 = zzwrVar.zzk;
                            if (i7 >= 0) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.zzg = z3;
        this.zzh = zzxd.zzn(i3, false);
        zzam zzamVar3 = this.zzd;
        this.zzi = zzamVar3.zzi;
        this.zzj = zzamVar3.zza();
        int i20 = this.zzd.zzf;
        int i21 = zzwrVar.zzp;
        this.zzl = Integer.bitCount(0);
        int i22 = this.zzd.zzf;
        this.zzm = true;
        int i23 = 0;
        while (true) {
            if (i23 >= zzwrVar.zzo.size()) {
                i23 = Integer.MAX_VALUE;
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwrVar.zzo.get(i23))) {
                break;
            } else {
                i23++;
            }
        }
        this.zzk = i23;
        this.zzo = (i3 & 384) == 128;
        this.zzp = (i3 & 64) == 64;
        zzam zzamVar4 = this.zzd;
        String str2 = zzamVar4.zzm;
        if (str2 == null) {
            i5 = 0;
        } else {
            i5 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    b = 0;
                    break;
                case "video/av01":
                    b = 1;
                    break;
                case "video/hevc":
                    b = 2;
                    break;
                case "video/avc":
                    b = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i5 = 5;
            } else if (b != 1) {
                if (b == 2) {
                    i5 = 3;
                } else if (b == 3) {
                    i5 = 2;
                } else if (b != 4) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
            }
        }
        this.zzq = i5;
        int i24 = zzamVar4.zzf;
        zzwr zzwrVar2 = this.zzf;
        if (!zzxd.zzn(i3, zzwrVar2.zzR) || (!(z4 = this.zze) && !zzwrVar2.zzH)) {
            i8 = 0;
        } else if (zzxd.zzn(i3, false) && this.zzg && z4 && zzamVar4.zzi != -1) {
            boolean z6 = zzwrVar2.zzB;
            boolean z7 = zzwrVar2.zzA;
            if ((i9 & i3) != 0) {
                i8 = 2;
            }
        }
        this.zzn = i8;
    }

    public static /* synthetic */ int zza(zzxc zzxcVar, zzxc zzxcVar2) {
        zzfvm zzfvmVarZza = (zzxcVar.zze && zzxcVar.zzh) ? zzxd.zzc : zzxd.zzc.zza();
        zzfts zzftsVarZzj = zzfts.zzj();
        Integer numValueOf = Integer.valueOf(zzxcVar.zzi);
        Integer numValueOf2 = Integer.valueOf(zzxcVar2.zzi);
        boolean z = zzxcVar.zzf.zzA;
        return zzftsVarZzj.zzc(numValueOf, numValueOf2, zzxd.zzd).zzc(Integer.valueOf(zzxcVar.zzj), Integer.valueOf(zzxcVar2.zzj), zzfvmVarZza).zzc(Integer.valueOf(zzxcVar.zzi), Integer.valueOf(zzxcVar2.zzi), zzfvmVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzxc zzxcVar, zzxc zzxcVar2) {
        zzfts zzftsVarZzb = zzfts.zzj().zzd(zzxcVar.zzh, zzxcVar2.zzh).zzb(zzxcVar.zzl, zzxcVar2.zzl);
        boolean z = zzxcVar.zzm;
        boolean z2 = zzxcVar2.zzm;
        zzfts zzftsVarZzc = zzftsVarZzb.zzd(true, true).zzd(zzxcVar.zze, zzxcVar2.zze).zzd(zzxcVar.zzg, zzxcVar2.zzg).zzc(Integer.valueOf(zzxcVar.zzk), Integer.valueOf(zzxcVar2.zzk), zzfvm.zzc().zza());
        boolean z3 = zzxcVar.zzo;
        zzfts zzftsVarZzd = zzftsVarZzc.zzd(z3, zzxcVar2.zzo);
        boolean z4 = zzxcVar.zzp;
        zzfts zzftsVarZzd2 = zzftsVarZzd.zzd(z4, zzxcVar2.zzp);
        if (z3 && z4) {
            zzftsVarZzd2 = zzftsVarZzd2.zzb(zzxcVar.zzq, zzxcVar2.zzq);
        }
        return zzftsVarZzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ boolean zzc(zzwz zzwzVar) {
        zzxc zzxcVar = (zzxc) zzwzVar;
        if (!zzfk.zzD(this.zzd.zzm, zzxcVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzK;
        return this.zzo == zzxcVar.zzo && this.zzp == zzxcVar.zzp;
    }
}
