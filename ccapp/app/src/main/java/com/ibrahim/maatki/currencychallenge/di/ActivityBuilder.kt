package com.ibrahim.maatki.currencychallenge.di

import com.ibrahim.maatki.currencychallenge.di.qualifier.ActivityScope
import com.ibrahim.maatki.currencychallenge.di.qualifier.FragmentScope
import com.zedney.cityguide.ui.about.AboutFragment
import com.zedney.cityguide.ui.about.di.AboutFragmentModule
import com.zedney.cityguide.ui.addeditadvertisement.AddEditAdvertisementFragment
import com.zedney.cityguide.ui.addeditadvertisement.di.AddEditAdvertisementFragmentModule
import com.zedney.cityguide.ui.addeditcompany.AddEditCompanyFragment
import com.zedney.cityguide.ui.addeditcompany.di.AddEditCompanyFragmentModule
import com.zedney.cityguide.ui.adpictureviewpager.CAdPicFragment
import com.zedney.cityguide.ui.adpictureviewpager.di.CAdPicFragmentModule
import com.zedney.cityguide.ui.advertisements.AdvertisementsListFragment
import com.zedney.cityguide.ui.advertisements.di.AdvertisementsListFragmentModule
import com.zedney.cityguide.ui.companies.CompaniesListFragment
import com.zedney.cityguide.ui.companies.di.CompaniesListFragmentModule
import com.zedney.cityguide.ui.contactus.ContactUsFragment
import com.zedney.cityguide.ui.contactus.di.ContactUsFragmentModule
import com.zedney.cityguide.ui.detailsactions.DetailsActionsFragment
import com.zedney.cityguide.ui.detailsactions.di.DetailsActionsFragmentModule
import com.zedney.cityguide.ui.forgotPassword.ForgotPasswordFragment
import com.zedney.cityguide.ui.forgotPassword.di.ForgotPasswordFragmentModule
import com.zedney.cityguide.ui.genericdetails.GenericDetailsFragment
import com.zedney.cityguide.ui.genericdetails.di.GenericDetailsFragmentModule
import com.zedney.cityguide.ui.genericpicture.GenericPictureFragment
import com.zedney.cityguide.ui.genericpicture.di.GenericPictureFragmentModule
import com.zedney.cityguide.ui.genericpictureviewpager.GenericPicturesVPFragment
import com.zedney.cityguide.ui.genericpictureviewpager.di.GenericPicturesVPFragmentModule
import com.zedney.cityguide.ui.intro.IntroActivity
import com.zedney.cityguide.ui.login.LoginFragment
import com.zedney.cityguide.ui.login.di.LoginFragmentModule
import com.zedney.cityguide.ui.main.MainActivity
import com.zedney.cityguide.ui.main.di.MainActivityModule
import com.zedney.cityguide.ui.more.MoreFragment
import com.zedney.cityguide.ui.more.di.MoreFragmentModule
import com.zedney.cityguide.ui.myaccount.MyAccountFragment
import com.zedney.cityguide.ui.myaccount.di.MyAccountFragmentModule
import com.zedney.cityguide.ui.news.NewsFragment
import com.zedney.cityguide.ui.news.di.NewsListFragmentModule
import com.zedney.cityguide.ui.notifications.NotificationsFragment
import com.zedney.cityguide.ui.notifications.di.NotificationsListFragmentModule
import com.zedney.cityguide.ui.ratepopup.RateDialogFragment
import com.zedney.cityguide.ui.ratepopup.di.RateDialogModule
import com.zedney.cityguide.ui.ratepopup.di.TermsDialogModule
import com.zedney.cityguide.ui.report.ReportFragment
import com.zedney.cityguide.ui.report.di.ReportFragmentModule
import com.zedney.cityguide.ui.signin.LoginRegisterFragment
import com.zedney.cityguide.ui.signin.di.LoginRegisterFragmentModule
import com.zedney.cityguide.ui.signup.SignUpFragment
import com.zedney.cityguide.ui.signup.di.SignUpFragmentModule
import com.zedney.cityguide.ui.smsverification.SmsVerificationFragment
import com.zedney.cityguide.ui.smsverification.di.SmsVerificationFragmentModule
import com.zedney.cityguide.ui.splash.SplashActivity
import com.zedney.cityguide.ui.termspopup.TermsDialogFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun splashActivity(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun introActivity(): IntroActivity

    @FragmentScope
    @ContributesAndroidInjector(modules = [CompaniesListFragmentModule::class])
    abstract fun companiesListFragment(): CompaniesListFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [CAdPicFragmentModule::class])
    abstract fun cAdPicFragment(): CAdPicFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [AdvertisementsListFragmentModule::class])
    abstract fun advertisementsListFragment(): AdvertisementsListFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [NewsListFragmentModule::class])
    abstract fun newsFragment(): NewsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [NotificationsListFragmentModule::class])
    abstract fun notificationsFragment(): NotificationsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [MoreFragmentModule::class])
    abstract fun moreFragment(): MoreFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [LoginRegisterFragmentModule::class])
    abstract fun loginRegisterFragment(): LoginRegisterFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [LoginFragmentModule::class])
    abstract fun loginFragment(): LoginFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [SignUpFragmentModule::class])
    abstract fun signUpFragment(): SignUpFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ContactUsFragmentModule::class])
    abstract fun contactUsFragment(): ContactUsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [SmsVerificationFragmentModule::class])
    abstract fun smsVerificationFragment(): SmsVerificationFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [AboutFragmentModule::class])
    abstract fun aboutFragment(): AboutFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [AddEditCompanyFragmentModule::class])
    abstract fun addEditCompanyFragment(): AddEditCompanyFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [AddEditAdvertisementFragmentModule::class])
    abstract fun addEditAdvertisementFragment(): AddEditAdvertisementFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ReportFragmentModule::class])
    abstract fun reportFragment(): ReportFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ForgotPasswordFragmentModule::class])
    abstract fun forgotPasswordFragment(): ForgotPasswordFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [MyAccountFragmentModule::class])
    abstract fun myAccountFragment(): MyAccountFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [GenericDetailsFragmentModule::class])
    abstract fun genericDetailsFragment(): GenericDetailsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [DetailsActionsFragmentModule::class])
    abstract fun detailsActionsFragment(): DetailsActionsFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [GenericPictureFragmentModule::class])
    abstract fun genericPictureFragment(): GenericPictureFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [GenericPicturesVPFragmentModule::class])
    abstract fun genericPicturesVPFragment(): GenericPicturesVPFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [RateDialogModule::class])
    abstract fun rateDialogFragment(): RateDialogFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [TermsDialogModule::class])
    abstract fun termsDialogFragment(): TermsDialogFragment
}