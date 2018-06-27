<template>
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Purchasing</h3>
        </div>
        <ul class="list-unstyled components">
            <li :class="{'active': isActivePurchaseQuotation == true}">
                <a @click="changeActivePQ" href="#PurchaseQuotation" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Purchase Quotation</a>
                <ul class="collapse list-unstyled" id="PurchaseQuotation">
                    <li><router-link to="/">Create Purchase Quotation</router-link> </li>
                    <li><router-link to="/viewQuotation">View Purchase Quotation</router-link></li>
                </ul>
            </li>
            <li :class="{'active': isActivePurchaseOrder == true}">
                <a @click="changeActivePO" href="#PurchaseOrder" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Purchase Order</a>
                <ul class="collapse list-unstyled" id="PurchaseOrder">
                    <li><router-link to="/createPO">Create Purchase Order</router-link> </li>
                     <li><router-link to="/viewPO">View Purchase Order</router-link> </li>
                </ul>
            </li>
            <li :class="{'active': isActiveReceivingReport == true}">
                <a @click="changeActiveRR" href="#ReceivingReport" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Receiving Report</a>
                <ul class="collapse list-unstyled" id="ReceivingReport">
                    <li><router-link to="/createRR">Create Receiving Report</router-link> </li>
                </ul>
            </li>

        </ul>
    </nav>
</template>

<script>
    export default{
        data(){
            return {
                isActivePurchaseQuotation: true,
                isActivePurchaseOrder: false,
                isActiveReceivingReport: true
            }
        },
        methods: {
            changeActivePQ(){
                this.isActivePurchaseQuotation = true;
                this.isActivePurchaseOrder = false;
                this.isActiveReceivingReport = false;
            },
            changeActivePO(){
                this.isActivePurchaseQuotation = false;
                this.isActivePurchaseOrder = true;
                this.isActiveReceivingReport = false;
            },
            changeActiveRR(){
                this.isActivePurchaseQuotation = false;
                this.isActivePurchaseOrder = false;
                this.isActiveReceivingReport = true;
            }
        }
    }
</script>

<style lang="scss">

</style>