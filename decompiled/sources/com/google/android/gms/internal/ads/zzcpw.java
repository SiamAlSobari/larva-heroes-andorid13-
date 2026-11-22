package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpw extends zzcse {
    private final zzcfi zzc;
    private final int zzd;
    private final Context zze;
    private final zzcpl zzf;
    private final zzdfy zzg;
    private final zzdde zzh;
    private final zzcwv zzi;
    private final boolean zzj;
    private final zzbzn zzk;
    private boolean zzl;

    zzcpw(zzcsd zzcsdVar, Context context, zzcfi zzcfiVar, int i, zzcpl zzcplVar, zzdfy zzdfyVar, zzdde zzddeVar, zzcwv zzcwvVar, zzbzn zzbznVar) {
        super(zzcsdVar);
        this.zzl = false;
        this.zzc = zzcfiVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcplVar;
        this.zzg = zzdfyVar;
        this.zzh = zzddeVar;
        this.zzi = zzcwvVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzff)).booleanValue();
        this.zzk = zzbznVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcse
    public final void zzb() {
        super.zzb();
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar != null) {
            zzcfiVar.destroy();
        }
    }

    public final void zzc(zzavs zzavsVar) {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar != null) {
            zzcfiVar.zzah(zzavsVar);
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
    public final void zzd(Activity activity, zzawf zzawfVar, boolean z) throws RemoteException {
        zzcfi zzcfiVar;
        zzfbe zzfbeVarZzD;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzD(context)) {
                zzcaa.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                    new zzfln(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkC)).booleanValue() && (zzcfiVar = this.zzc) != null && (zzfbeVarZzD = zzcfiVar.zzD()) != null && zzfbeVarZzD.zzar && zzfbeVarZzD.zzas != this.zzk.zzb()) {
            zzcaa.zzj("The app open consent form has been shown.");
            this.zzi.zza(zzfdb.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            zzcaa.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfdb.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z, context, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdfx e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
