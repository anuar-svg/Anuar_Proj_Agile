import VueRouter from "vue-router";
import Login from '@/views/Login';
import Home from '@/views/Home';
import Users from '@/components/admin/Users';
import Trash from '@/components/admin/Trash';

import PowerBI from "../components/powerbi/PowerBi";
import CustomComponent from "../components/powerbi/CustomComponent";


import Vue from 'vue';
import MainLayout from '@/components/shared/MainLayout';
import Calendar from '@/components/shared/Calendar';
import AdminLayout from "@/components/admin/AdminLayout";
import MenuItems from "../components/admin/MenuItems";
import Dictionary from "../components/admin/Dictionary";
import Chart from "../components/admin/Chart";
import Shezhire from "../components/admin/Shezhire";
import Widget from "../components/admin/Widget";

import zdrav1 from "../components/charts/zdrav/page-1/mainChart"
import zdrav2 from "../components/charts/zdrav/page-2/mainChart"
import zdrav3 from "../components/charts/zdrav/page-3/mainChart"
import zdrav4 from "../components/charts/zdrav/page-4/mainChart"
import zdrav5 from "../components/charts/zdrav/page-5/mainChart"
import zdrav6 from "../components/charts/zdrav/page-6/mainChart"

import edu1 from "../components/charts/edu/page-1/mainChart"
import edu2 from "../components/charts/edu/page-2/mainChart"
import edu3 from "../components/charts/edu/page-3/mainChart"
import edu4 from "../components/charts/edu/page-4/mainChart"
import edu5 from "../components/charts/edu/page-5/mainChart"
import edu6 from "../components/charts/edu/page-6/mainChart"
import edu7 from "../components/charts/edu/page-7/mainChart"
import edu8 from "../components/charts/edu/page-8/mainChart"
import edu9 from "../components/charts/edu/page-9/mainChart"
import edu10 from "../components/charts/edu/page-10/mainChart"

import socialEcoDev from "../components/charts/social-eco-dev/main/mainPage"
import socialEcoDev1 from "../components/charts/social-eco-dev/page-1/mainChart"
import socialEcoDev2 from "../components/charts/social-eco-dev/page-2/mainChart"
import socialEcoDev3 from "../components/charts/social-eco-dev/page-3/mainChart"
import socialEcoDev4 from "../components/charts/social-eco-dev/page-4/mainChart"
import socialEcoDev5 from "../components/charts/social-eco-dev/page-5/mainChart"
import socialEcoDev6 from "../components/charts/social-eco-dev/page-6/mainChart"
import socialEcoDev7 from "../components/charts/social-eco-dev/page-7/mainChart"
import socialEcoDev8 from "../components/charts/social-eco-dev/page-8/mainChart"
import socialEcoDev9 from "../components/charts/social-eco-dev/page-9/mainChart"
import socialEcoDev10 from "../components/charts/social-eco-dev/page-10/mainChart"
import socialEcoDev11 from "../components/charts/social-eco-dev/page-11/mainChart"
import socialEcoDev12 from "../components/charts/social-eco-dev/page-12/mainChart"
import socialEcoDev13 from "../components/charts/social-eco-dev/page-13/mainChart"
import socialEcoDev14 from "../components/charts/social-eco-dev/page-14/mainChart"
import socialEcoDev15 from "../components/charts/social-eco-dev/page-15/mainChart"
import socialEcoDev16 from "../components/charts/social-eco-dev/page-16/mainChart"
import socialEcoDev17 from "../components/charts/social-eco-dev/page-17/mainChart"
import socialEcoDev18 from "../components/charts/social-eco-dev/page-18/mainChart"
import socialEcoDev19 from "../components/charts/social-eco-dev/page-19/mainChart"
import socialEcoDev20 from "../components/charts/social-eco-dev/page-20/mainChart"
import socialEcoDev21 from "../components/charts/social-eco-dev/page-21/mainChart"
import socialEcoDev22 from "../components/charts/social-eco-dev/page-22/mainChart"
import socialEcoDev23 from "../components/charts/social-eco-dev/page-23/mainChart"

import socialProtection  from "../components/charts/social-protection/page-1/mainChart"
import socialProtection2 from "../components/charts/social-protection/page-2/mainChart"
import socialProtection3 from "../components/charts/social-protection/page-3/mainChart"
import socialProtection4 from "../components/charts/social-protection/page-4/mainChart"
import socialProtection5 from "../components/charts/social-protection/page-5/mainChart"
import socialProtection6 from "../components/charts/social-protection/page-6/mainChart"
import socialProtection7 from "../components/charts/social-protection/page-7/mainChart"
import socialProtection8 from "../components/charts/social-protection/page-8/mainChart"
import socialProtection9 from "../components/charts/social-protection/page-9/mainChart"
import socialProtection10 from "../components/charts/social-protection/page-10/mainChart"
import socialProtection11 from "../components/charts/social-protection/page-11/mainChart"
import socialProtection12 from "../components/charts/social-protection/page-12/mainChart"
import socialProtection13 from "../components/charts/social-protection/page-13/mainChart"
import socialProtection14 from "../components/charts/social-protection/page-14/mainChart"
import socialProtection15 from "../components/charts/social-protection/page-15/mainChart"

import selskoeHozjajstvo from "../components/charts/selskoe-hozjajstvo/page-1/mainChart"
import selskoeHozjajstvo2 from "../components/charts/selskoe-hozjajstvo/page-2/mainChart"
import selskoeHozjajstvo3 from "../components/charts/selskoe-hozjajstvo/page-3/mainChart"
import selskoeHozjajstvo5 from "../components/charts/selskoe-hozjajstvo/page-5/mainChart"
import selskoeHozjajstvo6 from "../components/charts/selskoe-hozjajstvo/page-6/mainChart"

import budgetInvest from "../components/charts/budget-invest/page-1/mainChart"

import diplomaAnalytics from "../components/charts/diploma-analytics/page-1/mainChart"
import diplomaAnalytics2 from "../components/charts/diploma-analytics/page-2/mainChart"
import diplomaAnalytics3 from "../components/charts/diploma-analytics/page-3/mainChart"

import vrpForecast from "../components/charts/vrp-forecast/page-1/mainChart"
import vrpForecast2 from "../components/charts/vrp-forecast/page-2/mainChart"
import vrpForecast3 from "../components/charts/vrp-forecast/page-3/mainChart"
import vrpForecast4 from "../components/charts/vrp-forecast/page-4/mainChart"
import vrpForecast5 from "../components/charts/vrp-forecast/page-5/mainChart"
import vrpForecast6 from "../components/charts/vrp-forecast/page-6/mainChart"
import vrpForecast7 from "../components/charts/vrp-forecast/page-7/mainChart"

import budget from "../components/charts/budget/page-1/mainChart"
import budget2 from "../components/charts/budget/page-2/mainChart"
import budget3 from "../components/charts/budget/page-3/mainChart"
import budget4 from "../components/charts/budget/page-4/mainChart"
import budget5 from "../components/charts/budget/page-5/mainChart"
import budget6 from "../components/charts/budget/page-6/mainChart"
import budget7 from "../components/charts/budget/page-7/mainChart"
import budget8 from "../components/charts/budget/page-8/mainChart"
import budget9 from "../components/charts/budget/page-9/mainChart"
import budget10 from "../components/charts/budget/page-10/mainChart"

import digitalObjects from "../components/charts/digital-social-objects/page-1/mainChart"
// import digitalObjects2 from "../components/charts/digital-social-objects/page-2/mainChart"

import animalHusbandry from "../components/charts/animal-husbandry/page-1/mainChart"
import animalHusbandry2 from "../components/charts/animal-husbandry/page-2/mainChart"
import animalHusbandry4 from "../components/charts/animal-husbandry/page-4/mainChart"
import animalHusbandry5 from "../components/charts/animal-husbandry/page-5/mainChart"
import animalHusbandry6 from "../components/charts/animal-husbandry/page-6/mainChart"

import zdravRate from "../components/charts/zdrav-rate/page-1/mainChart"
import zdravRate2 from "../components/charts/zdrav-rate/page-2/mainChart"
import zdravRate3 from "../components/charts/zdrav-rate/page-3/mainChart"
import zdravRate4 from "../components/charts/zdrav-rate/page-4/mainChart"
import zdravRate5 from "../components/charts/zdrav-rate/page-5/mainChart"
import zdravRate6 from "../components/charts/zdrav-rate/page-6/mainChart"
import zdravRate7 from "../components/charts/zdrav-rate/page-7/mainChart"

import eduRate from "../components/charts/edu-rate/page-1/mainChart"
import eduRate2 from "../components/charts/edu-rate/page-2/mainChart"
import eduRate3 from "../components/charts/edu-rate/page-3/mainChart"
import eduRate4 from "../components/charts/edu-rate/page-4/mainChart"
import eduRate5 from "../components/charts/edu-rate/page-5/mainChart"

import strategicManagement from "../components/charts/strategic-management/page-1/mainChart"
import strategicManagement2 from "../components/charts/strategic-management/page-2/mainChart"

import operationalMonitoring from "../components/charts/operational-monitoring/main/mainPage"

Vue.use(VueRouter);

const router =  new VueRouter({
    mode: 'history',
    routes: [
        { path: '/main', name:'main', component: MainLayout, children:[
                {
                    path: 'home', name:'home', component: operationalMonitoring
                },
                {
                    path: 'bi/:id', name: 'bi', component: PowerBI, props: true,
                },
                {
                    path: 'gmap', name: 'gmap', component: CustomComponent
                },
                {
                    path: 'calendar', name: 'calendar', component: Calendar
                },
                {
                    path: 'zdrav/1', name: 'zdrav', component: zdrav1
                },
                {
                    path: 'zdrav/2', name: 'zdrav2', component: zdrav2
                },
                {
                    path: 'zdrav/3', name: 'zdrav3', component: zdrav3
                },
                {
                    path: 'zdrav/4', name: 'zdrav4', component: zdrav4
                },
                {
                    path: 'zdrav/5', name: 'zdrav5', component: zdrav5
                },
                {
                    path: 'zdrav/6', name: 'zdrav6', component: zdrav6
                },
                {
                    path: 'edu/1', name: 'edu', component: edu1
                },
                {
                    path: 'edu/2', name: 'edu2', component: edu2
                },
                {
                    path: 'edu/3', name: 'edu3', component: edu3
                },
                {
                    path: 'edu/4', name: 'edu4', component: edu4
                },
                {
                    path: 'edu/5', name: 'edu5', component: edu5
                },
                {
                    path: 'edu/6', name: 'edu6', component: edu6
                },
                {
                    path: 'edu/7', name: 'edu7', component: edu7
                },
                {
                    path: 'edu/8', name: 'edu8', component: edu8
                },
                {
                    path: 'edu/9', name: 'edu9', component: edu9
                },
                {
                    path: 'edu/10', name: 'edu10', component: edu10
                },
                {
                    path: 'social-eco-dev', name: 'social-eco-dev', component: socialEcoDev
                },
                {
                    path: 'social-eco-dev/1', name: 'social-eco-dev1', component: socialEcoDev1
                },
                {
                    path: 'social-eco-dev/2', name: 'social-eco-dev2', component: socialEcoDev2
                },
                {
                    path: 'social-eco-dev/3', name: 'social-eco-dev3', component: socialEcoDev3
                },
                {
                    path: 'social-eco-dev/4', name: 'social-eco-dev4', component: socialEcoDev4
                },
                {
                    path: 'social-eco-dev/5', name: 'social-eco-dev5', component: socialEcoDev5
                },
                {
                    path: 'social-eco-dev/6', name: 'social-eco-dev6', component: socialEcoDev6
                },
                {
                    path: 'social-eco-dev/7', name: 'social-eco-dev7', component: socialEcoDev7
                },
                {
                    path: 'social-eco-dev/8', name: 'social-eco-dev8', component: socialEcoDev8
                },
                {
                    path: 'social-eco-dev/9', name: 'social-eco-dev9', component: socialEcoDev9
                },
                {
                    path: 'social-eco-dev/10', name: 'social-eco-dev10', component: socialEcoDev10
                },
                {
                    path: 'social-eco-dev/11', name: 'social-eco-dev11', component: socialEcoDev11
                },
                {
                    path: 'social-eco-dev/12', name: 'social-eco-dev12', component: socialEcoDev12
                },
                {
                    path: 'social-eco-dev/13', name: 'social-eco-dev13', component: socialEcoDev13
                },
                {
                    path: 'social-eco-dev/14', name: 'social-eco-dev14', component: socialEcoDev14
                },
                {
                    path: 'social-eco-dev/15', name: 'social-eco-dev15', component: socialEcoDev15
                },
                {
                    path: 'social-eco-dev/16', name: 'social-eco-dev16', component: socialEcoDev16
                },
                {
                    path: 'social-eco-dev/17', name: 'social-eco-dev17', component: socialEcoDev17
                },
                {
                    path: 'social-eco-dev/18', name: 'social-eco-dev18', component: socialEcoDev18
                },
                {
                    path: 'social-eco-dev/19', name: 'social-eco-dev19', component: socialEcoDev19
                },
                {
                    path: 'social-eco-dev/20', name: 'social-eco-dev20', component: socialEcoDev20
                },
                {
                    path: 'social-eco-dev/21', name: 'social-eco-dev21', component: socialEcoDev21
                },
                {
                    path: 'social-eco-dev/22', name: 'social-eco-dev22', component: socialEcoDev22
                },
                {
                    path: 'social-eco-dev/23', name: 'social-eco-dev23', component: socialEcoDev23
                },
                {
                    path: 'social-protection/1', name: 'social-protection', component: socialProtection
                },
                {
                    path: 'social-protection/2', name: 'social-protection2', component: socialProtection2
                },
                {
                    path: 'social-protection/3', name: 'social-protection3', component: socialProtection3
                },
                {
                    path: 'social-protection/4', name: 'social-protection4', component: socialProtection4
                },
                {
                    path: 'social-protection/5', name: 'social-protection5', component: socialProtection5
                },
                {
                    path: 'social-protection/6', name: 'social-protection6', component: socialProtection6
                },
                {
                    path: 'social-protection/7', name: 'social-protection7', component: socialProtection7
                },
                {
                    path: 'social-protection/8', name: 'social-protection8', component: socialProtection8
                },
                {
                    path: 'social-protection/9', name: 'social-protection9', component: socialProtection9
                },
                {
                    path: 'social-protection/10', name: 'social-protection10', component: socialProtection10
                },
                {
                    path: 'social-protection/11', name: 'social-protection11', component: socialProtection11
                },
                {
                    path: 'social-protection/12', name: 'social-protection12', component: socialProtection12
                },
                {
                    path: 'social-protection/13', name: 'social-protection13', component: socialProtection13
                },
                {
                    path: 'social-protection/14', name: 'social-protection14', component: socialProtection14
                },
                {
                    path: 'social-protection/15', name: 'social-protection15', component: socialProtection15
                },
                {
                    path: 'selskoe-hozjajstvo/1', name: 'selskoe-hozjajstvo', component: selskoeHozjajstvo
                },
                {
                    path: 'selskoe-hozjajstvo/2', name: 'selskoe-hozjajstvo2', component: selskoeHozjajstvo2
                },
                {
                    path: 'selskoe-hozjajstvo/3', name: 'selskoe-hozjajstvo3', component: selskoeHozjajstvo3
                },
                {
                    path: 'selskoe-hozjajstvo/5', name: 'selskoe-hozjajstvo5', component: selskoeHozjajstvo5
                },
                {
                    path: 'selskoe-hozjajstvo/6', name: 'selskoe-hozjajstvo6', component: selskoeHozjajstvo6
                },
                {
                    path: 'budget-invest/1', name: 'budget-invest', component: budgetInvest
                },
                {
                    path: 'vrp-forecast/1', name: 'vrp-forecast', component: vrpForecast
                },
                {
                    path: 'vrp-forecast/2', name: 'vrp-forecast2', component: vrpForecast2
                },
                {
                    path: 'vrp-forecast/3', name: 'vrp-forecast3', component: vrpForecast3
                },
                {
                    path: 'vrp-forecast/4', name: 'vrp-forecast4', component: vrpForecast4
                },
                {
                    path: 'vrp-forecast/5', name: 'vrp-forecast5', component: vrpForecast5
                },
                {
                    path: 'vrp-forecast/6', name: 'vrp-forecast6', component: vrpForecast6
                },
                {
                    path: 'vrp-forecast/7', name: 'vrp-forecast7', component: vrpForecast7
                },
                {
                    path: 'diploma-analytics/1', name: 'diploma-analytics', component: diplomaAnalytics
                },
                {
                    path: 'diploma-analytics/2', name: 'diploma-analytics2', component: diplomaAnalytics2
                },
                {
                    path: 'diploma-analytics/3', name: 'diploma-analytics3', component: diplomaAnalytics3
                },
                {
                    path: 'budget/1', name: 'budget', component: budget
                },
                {
                    path: 'budget/2', name: 'budget2', component: budget2
                },
                {
                    path: 'budget/3', name: 'budget3', component: budget3
                },
                {
                    path: 'budget/4', name: 'budget4', component: budget4
                },
                {
                    path: 'budget/5', name: 'budget5', component: budget5
                },
                {
                    path: 'budget/6', name: 'budget6', component: budget6
                },
                {
                    path: 'budget/7', name: 'budget7', component: budget7
                },
                {
                    path: 'budget/8', name: 'budget8', component: budget8
                },
                {
                    path: 'budget/9', name: 'budget9', component: budget9
                },
                {
                    path: 'budget/10', name: 'budget10', component: budget10
                },
                {
                    path: 'digital-social-objects/1', name: 'digital-social-objects', component: digitalObjects
                },
                // {
                //     path: 'digital-social-objects/2', name: 'digital-social-objects2', component: digitalObjects2
                // },
                {
                    path: 'animal-husbandry/1', name: 'animal-husbandry', component: animalHusbandry
                },
                {
                    path: 'animal-husbandry/2', name: 'animal-husbandry2', component: animalHusbandry2
                },
                {
                    path: 'animal-husbandry/4', name: 'animal-husbandry4', component: animalHusbandry4
                },
                {
                    path: 'animal-husbandry/5', name: 'animal-husbandry5', component: animalHusbandry5
                },
                {
                    path: 'animal-husbandry/6', name: 'animal-husbandry6', component: animalHusbandry6
                },
                {
                    path: 'zdrav-rate/1', name: 'zdrav-rate', component: zdravRate
                },
                {
                    path: 'zdrav-rate/2', name: 'zdrav-rate2', component: zdravRate2
                },
                {
                    path: 'zdrav-rate/3', name: 'zdrav-rate3', component: zdravRate3
                },
                {
                    path: 'zdrav-rate/4', name: 'zdrav-rate4', component: zdravRate4
                },
                {
                    path: 'zdrav-rate/5', name: 'zdrav-rate5', component: zdravRate5
                },
                {
                    path: 'zdrav-rate/6', name: 'zdrav-rate6', component: zdravRate6
                },
                {
                    path: 'zdrav-rate/7', name: 'zdrav-rate7', component: zdravRate7
                },
                {
                    path: 'edu-rate/1', name: 'edu-rate', component: eduRate
                },
                {
                    path: 'edu-rate/2', name: 'edu-rate2', component: eduRate2
                },
                {
                    path: 'edu-rate/3', name: 'edu-rate3', component: eduRate3
                },
                {
                    path: 'edu-rate/4', name: 'edu-rate4', component: eduRate4
                },
                {
                    path: 'edu-rate/5', name: 'edu-rate5', component: eduRate5
                },
                {
                    path: 'strategic-management/1', name: 'strategic-management', component: strategicManagement
                },
                {
                    path: 'strategic-management/2', name: 'strategic-management2', component: strategicManagement2
                },
            ]
        },
        { path: '/login', name:'login', component: Login},
        { path: '/admin', name:'admin', component: AdminLayout
            , children:[
                {
                    path: 'users', name: 'users', component: Users
                },
                {
                    path: 'trash', name: 'trash', component: Trash
                },
                {
                    path: 'calendar', name: 'admin-calendar', component: Calendar
                },
                {
                    path: 'menuitems', name: 'menuitems', component: MenuItems
                },
                {
                    path: 'dictionary', name: 'dictionary', component: Dictionary
                },
                {
                    path: 'chart', name: 'chart', component: Chart
                },
                {
                    path: 'shezhire', name: 'shezhire', component: Shezhire
                },
                {
                    path: 'widget', name: 'widget', component: Widget
                }
            ]
        },
    ]


});



router.beforeEach((to, from, next) => {
    const publicPages = ['/login'];

    const authRequired = !publicPages.includes(to.path);
    const loggedIn = sessionStorage.getItem('user-token');
    if (authRequired && !loggedIn ||to.name==null) {
        next('/login');
    } else {
        next();
    }
});

export default router;






