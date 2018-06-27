import viewPurchaseQuotation from './components/viewPurchaseQuotation';
import createPurchaseQuotation from './components/createPurchaseQuotation';
import createPurchaseOrder from './components/createPurchaseOrder';
import createReceivingReport from './components/createReceivingReport';
import viewPurchaseOrder from './components/viewPurchaseOrder';

export const routes = [
    { path: '', component: createPurchaseQuotation },
    { path: '/viewQuotation', component: viewPurchaseQuotation },
    { path: '/createPO', component: createPurchaseOrder },
    { path: '/createRR',component: createReceivingReport },
    { path: '/viewPO', component: viewPurchaseOrder }
];