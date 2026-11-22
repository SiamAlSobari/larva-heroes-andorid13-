package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwv extends zzwu {
    zzwv() {
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final int zza(Map.Entry entry) {
        return ((zzxg) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final zzwy zzb(Object obj) {
        return ((zzxf) obj).zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final zzwy zzc(Object obj) {
        return ((zzxf) obj).zzT();
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final Object zzd(zzwt zzwtVar, zzyu zzyuVar, int i) {
        return zzwtVar.zzb(zzyuVar, i);
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final Object zze(Object obj, zzzg zzzgVar, Object obj2, zzwt zzwtVar, zzwy zzwyVar, Object obj3, zzzy zzzyVar) throws IOException {
        Object objValueOf;
        Object objZzf;
        zzxh zzxhVar = (zzxh) obj2;
        zzxg zzxgVar = zzxhVar.zzd;
        int i = zzxgVar.zzb;
        if (zzxgVar.zzc != zzaao.ENUM) {
            switch (zzxhVar.zzd.zzc) {
                case DOUBLE:
                    objValueOf = Double.valueOf(zzzgVar.zza());
                    break;
                case FLOAT:
                    objValueOf = Float.valueOf(zzzgVar.zzb());
                    break;
                case INT64:
                    objValueOf = Long.valueOf(zzzgVar.zzl());
                    break;
                case UINT64:
                    objValueOf = Long.valueOf(zzzgVar.zzo());
                    break;
                case INT32:
                    objValueOf = Integer.valueOf(zzzgVar.zzg());
                    break;
                case FIXED64:
                    objValueOf = Long.valueOf(zzzgVar.zzk());
                    break;
                case FIXED32:
                    objValueOf = Integer.valueOf(zzzgVar.zzf());
                    break;
                case BOOL:
                    objValueOf = Boolean.valueOf(zzzgVar.zzP());
                    break;
                case STRING:
                    objValueOf = zzzgVar.zzt();
                    break;
                case GROUP:
                    zzxg zzxgVar2 = zzxhVar.zzd;
                    if (!zzxgVar2.zzd) {
                        Object objZzf2 = zzwyVar.zzf(zzxgVar2);
                        if (objZzf2 instanceof zzxj) {
                            zzzh zzzhVarZzb = zzzd.zza().zzb(objZzf2.getClass());
                            if (!((zzxj) objZzf2).zzaq()) {
                                Object objZze = zzzhVarZzb.zze();
                                zzzhVarZzb.zzg(objZze, objZzf2);
                                zzwyVar.zzk(zzxhVar.zzd, objZze);
                                objZzf2 = objZze;
                            }
                            zzzgVar.zzv(objZzf2, zzzhVarZzb, zzwtVar);
                            return obj3;
                        }
                    }
                    objValueOf = zzzgVar.zzr(zzxhVar.zzc.getClass(), zzwtVar);
                    break;
                case MESSAGE:
                    zzxg zzxgVar3 = zzxhVar.zzd;
                    if (!zzxgVar3.zzd) {
                        Object objZzf3 = zzwyVar.zzf(zzxgVar3);
                        if (objZzf3 instanceof zzxj) {
                            zzzh zzzhVarZzb2 = zzzd.zza().zzb(objZzf3.getClass());
                            if (!((zzxj) objZzf3).zzaq()) {
                                Object objZze2 = zzzhVarZzb2.zze();
                                zzzhVarZzb2.zzg(objZze2, objZzf3);
                                zzwyVar.zzk(zzxhVar.zzd, objZze2);
                                objZzf3 = objZze2;
                            }
                            zzzgVar.zzw(objZzf3, zzzhVarZzb2, zzwtVar);
                            return obj3;
                        }
                    }
                    objValueOf = zzzgVar.zzs(zzxhVar.zzc.getClass(), zzwtVar);
                    break;
                case BYTES:
                    objValueOf = zzzgVar.zzp();
                    break;
                case UINT32:
                    objValueOf = Integer.valueOf(zzzgVar.zzj());
                    break;
                case ENUM:
                    throw new IllegalStateException("Shouldn't reach here.");
                case SFIXED32:
                    objValueOf = Integer.valueOf(zzzgVar.zzh());
                    break;
                case SFIXED64:
                    objValueOf = Long.valueOf(zzzgVar.zzm());
                    break;
                case SINT32:
                    objValueOf = Integer.valueOf(zzzgVar.zzi());
                    break;
                case SINT64:
                    objValueOf = Long.valueOf(zzzgVar.zzn());
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iZzg = zzzgVar.zzg();
            if (zzxhVar.zzd.zza.zza(iZzg) == null) {
                return zzzj.zzB(obj, i, iZzg, obj3, zzzyVar);
            }
            objValueOf = Integer.valueOf(iZzg);
        }
        zzxg zzxgVar4 = zzxhVar.zzd;
        if (zzxgVar4.zzd) {
            zzwyVar.zzh(zzxgVar4, objValueOf);
        } else {
            int iOrdinal = zzxgVar4.zzc.ordinal();
            if ((iOrdinal == 9 || iOrdinal == 10) && (objZzf = zzwyVar.zzf(zzxhVar.zzd)) != null) {
                byte[] bArr = zzxs.zzd;
                objValueOf = ((zzyu) objZzf).zzav().zzx((zzyu) objValueOf).zzE();
            }
            zzwyVar.zzk(zzxhVar.zzd, objValueOf);
        }
        return obj3;
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final void zzf(Object obj) {
        ((zzxf) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final void zzg(zzzg zzzgVar, Object obj, zzwt zzwtVar, zzwy zzwyVar) throws IOException {
        zzxh zzxhVar = (zzxh) obj;
        zzwyVar.zzk(zzxhVar.zzd, zzzgVar.zzs(zzxhVar.zzc.getClass(), zzwtVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final void zzh(zzud zzudVar, Object obj, zzwt zzwtVar, zzwy zzwyVar) throws IOException {
        zzxh zzxhVar = (zzxh) obj;
        zzyt zzytVarZzau = zzxhVar.zzc.zzau();
        zzua zzuaVar = (zzua) zzudVar;
        zzuj zzujVarZzH = zzuj.zzH(zzuaVar.zza, 0, zzuaVar.zzd(), true);
        zzytVarZzau.zzy(zzujVarZzH, zzwtVar);
        zzwyVar.zzk(zzxhVar.zzd, zzytVarZzau.zzE());
        zzujVarZzH.zzz(0);
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final boolean zzi(zzyu zzyuVar) {
        return zzyuVar instanceof zzxf;
    }

    @Override // com.google.android.gms.internal.gtm.zzwu
    final void zzj(zzur zzurVar, Map.Entry entry) throws IOException {
        zzxg zzxgVar = (zzxg) entry.getKey();
        if (!zzxgVar.zzd) {
            zzaao zzaaoVar = zzaao.DOUBLE;
            switch (zzxgVar.zzc) {
                case DOUBLE:
                    zzurVar.zzf(zzxgVar.zzb, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzurVar.zzo(zzxgVar.zzb, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzurVar.zzt(zzxgVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzurVar.zzK(zzxgVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzurVar.zzr(zzxgVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzurVar.zzm(zzxgVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzurVar.zzk(zzxgVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzurVar.zzb(zzxgVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzurVar.zzG(zzxgVar.zzb, (String) entry.getValue());
                    break;
                case GROUP:
                    zzurVar.zzq(zzxgVar.zzb, entry.getValue(), zzzd.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzurVar.zzv(zzxgVar.zzb, entry.getValue(), zzzd.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzurVar.zzd(zzxgVar.zzb, (zzud) entry.getValue());
                    break;
                case UINT32:
                    zzurVar.zzI(zzxgVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzurVar.zzr(zzxgVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzurVar.zzx(zzxgVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzurVar.zzz(zzxgVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzurVar.zzB(zzxgVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzurVar.zzD(zzxgVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzaao zzaaoVar2 = zzaao.DOUBLE;
        switch (zzxgVar.zzc) {
            case DOUBLE:
                zzzj.zzI(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case FLOAT:
                zzzj.zzM(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case INT64:
                zzzj.zzP(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case UINT64:
                zzzj.zzX(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case INT32:
                zzzj.zzO(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case FIXED64:
                zzzj.zzL(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case FIXED32:
                zzzj.zzK(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case BOOL:
                zzzj.zzG(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case STRING:
                zzzj.zzV(zzxgVar.zzb, (List) entry.getValue(), zzurVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzzj.zzN(zzxgVar.zzb, (List) entry.getValue(), zzurVar, zzzd.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzzj.zzQ(zzxgVar.zzb, (List) entry.getValue(), zzurVar, zzzd.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzzj.zzH(zzxgVar.zzb, (List) entry.getValue(), zzurVar);
                break;
            case UINT32:
                zzzj.zzW(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case ENUM:
                zzzj.zzO(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SFIXED32:
                zzzj.zzR(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SFIXED64:
                zzzj.zzS(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SINT32:
                zzzj.zzT(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SINT64:
                zzzj.zzU(zzxgVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
        }
    }
}
